package br.com.cp2digital.service;

import br.com.cp2digital.dto.UserCreatedDto;
import br.com.cp2digital.model.User;
import br.com.cp2digital.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    private PasswordEncoder encoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = repository.findByUserName(username);
        return user.orElseThrow(() -> new UsernameNotFoundException("usupario não encontrado!"));
    }

    public void addUser (User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        repository.save(user);
    }

    public Page<UserCreatedDto> listAll(Pageable pageable) {
        return repository.findAll(pageable).map(UserCreatedDto::new);
    }
}
