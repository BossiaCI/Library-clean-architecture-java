package com.library.domain.models;

import java.util.List;

public class User {
    private final int id;
    private final String username;
    private final String password;
    private final List<Role> roles;

    public User(int id, String username, String password, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(String roleName) {
        return roles.stream().anyMatch(role -> role.getRoleName().equals(roleName));
    }

    // Getter methods for id, username, password

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}
