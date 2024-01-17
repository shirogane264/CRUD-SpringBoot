package com.example.CRUDSpringBoot.dao;

import com.example.CRUDSpringBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    User getUserId(Long id);

    User removeUser(Long id);
}
