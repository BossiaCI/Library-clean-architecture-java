package com.library.infrastructure.repositories;

import com.library.domain.interfaces.AdminRepository;
import com.library.domain.models.Admin;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryAdminRepository implements AdminRepository {
    private final Map<String, Admin> adminMap = new HashMap<>();

    public InMemoryAdminRepository() {
        save(new Admin(1, "admin", "password123"));
    }

    @Override
    public Optional<Admin> findByUsername(String username) {
        return Optional.ofNullable(adminMap.get(username));
    }

    @Override
    public void save(Admin admin) {
        adminMap.put(admin.getUsername(), admin);
    }
}
