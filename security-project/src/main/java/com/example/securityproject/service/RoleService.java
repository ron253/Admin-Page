package com.example.securityproject.service;

import com.example.securityproject.model.Role;

public interface RoleService {
    Role findByName(String name);
}
