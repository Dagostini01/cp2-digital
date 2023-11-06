package br.com.cp2digital.service;

import br.com.cp2digital.dto.UserCreatedDto;
import br.com.cp2digital.model.Usuario;
import br.com.cp2digital.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    private PasswordEncoder encoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> user = repository.findByUsername(username);
        return user.orElseThrow(() -> new UsernameNotFoundException("usupario não encontrado!"));
    }

    public void addUser (Usuario usuario) {
        usuario.setPassword(encoder.encode(usuario.getPassword()));
        repository.save(usuario);
    }

    public Page<UserCreatedDto> listAll(Pageable pageable) {
        return repository.findAll(pageable).map(UserCreatedDto::new);
    }
}
