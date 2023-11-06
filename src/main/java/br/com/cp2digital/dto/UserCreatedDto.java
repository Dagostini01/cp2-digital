package br.com.cp2digital.dto;

import br.com.cp2digital.model.UserRole;
import br.com.cp2digital.model.Usuario;

public record UserCreatedDto(Long id, String username, UserRole roles) {
    public UserCreatedDto (Usuario usuario) { this (usuario.getId(), usuario.getUsername(), usuario.getRole());}
}
