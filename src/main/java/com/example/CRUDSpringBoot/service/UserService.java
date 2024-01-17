package com.example.CRUDSpringBoot.service;

import com.example.CRUDSpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    User getUserId(Long id);

    User removeUser(Long id);

}