package com.library.infrastructure.repositories;

import com.library.domain.interfaces.RoleRepository;
import com.library.domain.models.Role;

import java.util.HashMap;
import java.util.Map;

public class InMemoryRoleRepository implements RoleRepository {
    private final Map<String, Role> roles = new HashMap<>();

    @Override
    public void save(Role role) {
        roles.put(role.getRoleName(), role);
    }
}
