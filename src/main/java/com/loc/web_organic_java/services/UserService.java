package com.loc.web_organic_java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loc.web_organic_java.models.User;
import com.loc.web_organic_java.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByToken(String token) {
        return userRepository.findByToken(token)
                .orElseThrow(() -> new RuntimeException("User not found for token: " + token));
    }
}
