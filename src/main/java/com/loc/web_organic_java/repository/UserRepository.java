package com.loc.web_organic_java.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loc.web_organic_java.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByToken(String token);
}
