package com.library.domain.interfaces;

import com.library.domain.models.User;

public interface UserRepository {
    void save(User user);
    User findByUsername(String username);
}
