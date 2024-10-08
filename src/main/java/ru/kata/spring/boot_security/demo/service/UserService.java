package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> getAllUsers();

    User saveUser(User user);

    void deleteById(Long id);

    User editUser(User user);
}
