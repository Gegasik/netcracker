package com.netcracker.service.impl;

import com.netcracker.entity.Users;
import com.netcracker.repositories.UsersRepository;
import com.netcracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public List<Users> findAll() {
        return (List<Users>) usersRepository.findAll();
    }

    @Override
    public Optional<Users> findById(Long id) {
        return usersRepository.findById(id);
    }

    @Override
    public Optional<Users> findByLogin(String login) {
        return Optional.of(usersRepository.findByUserName(login));
    }


    @Override
    public Users save(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public void delete(long id) {
        usersRepository.deleteById(id);
    }
}
