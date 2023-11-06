package br.com.cp2digital.model;

import jakarta.persistence.Entity;

@Entity
public class User {

    private Long id;
    private String username;
    private String password;
    private String role;
}
