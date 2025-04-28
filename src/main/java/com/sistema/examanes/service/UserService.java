package com.sistema.examanes.service;

import com.sistema.examanes.entities.User;
import com.sistema.examanes.entities.UserRol;

import java.util.Set;

public interface UserService {

    public User saveUser(User user, Set<UserRol> userRoles) throws Exception;
}
