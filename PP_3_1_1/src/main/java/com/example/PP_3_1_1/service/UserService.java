package com.example.PP_3_1_1.service;

import com.example.PP_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void updateUser(Long id, User user);
    void saveUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
}
