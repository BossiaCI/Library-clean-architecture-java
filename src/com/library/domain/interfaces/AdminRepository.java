package com.library.domain.interfaces;

import com.library.domain.models.Admin;

import java.util.Optional;

public interface AdminRepository {
    Optional<Admin> findByUsername(String username);
    void save(Admin admin);
}
