package br.com.cp2digital.dto;

import br.com.cp2digital.model.UserRole;

public record UserDto(
        String username,
        String password,
        UserRole roles
) {

}
