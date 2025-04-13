package com.library.domain.services;

import com.library.domain.models.User;

public class OAuthService {
    public User authenticateWithOAuth(String provider, String token) {
        // Placeholder logic for OAuth integration with providers like Google/Facebook
        return new User(1, "user1", "dummyPassword", List.of(new Role("USER")));
    }
}
