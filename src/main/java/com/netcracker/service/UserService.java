package com.netcracker.service;

import com.netcracker.entity.Users;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<Users> findAll();

    Optional<Users> findById(Long id);

    Optional<Users> findByLogin(String login);

    Users save(Users user);

    void delete(long id);
}
