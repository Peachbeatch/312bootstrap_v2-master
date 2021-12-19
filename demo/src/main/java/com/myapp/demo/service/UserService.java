package com.myapp.demo.service;

import com.myapp.demo.model.User;

public interface UserService {
    void createNewUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    Iterable<User> getAllUsers();
}
