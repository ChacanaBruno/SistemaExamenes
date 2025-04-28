package com.sistema.examanes.controller;

import com.sistema.examanes.entities.Rol;
import com.sistema.examanes.entities.User;
import com.sistema.examanes.entities.UserRol;
import com.sistema.examanes.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        Set<UserRol> roles = new HashSet<>();

        Rol rol = new Rol();

    }
}
