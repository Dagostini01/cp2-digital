package br.com.cp2digital.dto;

import br.com.cp2digital.model.UserRole;
import br.com.cp2digital.model.User;

public record UserCreatedDto(Long id, String username, UserRole roles) {
    public UserCreatedDto (User user) { this (user.getId(), user.getUsername(), user.getRole());}
}
