package com.example.securityproject.service;

import com.example.securityproject.model.User;
import com.example.securityproject.model.UserDto;
import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
