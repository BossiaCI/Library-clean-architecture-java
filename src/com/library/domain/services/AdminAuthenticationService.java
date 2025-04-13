package com.library.domain.services;

import com.library.domain.interfaces.AdminRepository;
import com.library.domain.models.Admin;

public class AdminAuthenticationService {
    private final AdminRepository adminRepository;

    public AdminAuthenticationService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin authenticate(String username, String password) {
        Admin admin = adminRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Admin not found"));

        if (!admin.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return admin;
    }
}
