package com.sistema.examanes.service.impl;

import com.sistema.examanes.entities.User;
import com.sistema.examanes.entities.UserRol;
import com.sistema.examanes.repository.RolRepository;
import com.sistema.examanes.repository.UserRepository;
import com.sistema.examanes.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private RolRepository rolRepository;

    public UserServiceImpl(UserRepository userRepository, RolRepository rolRepository) {
        this.userRepository = userRepository;
        this.rolRepository = rolRepository;
    }

    @Override
    public User saveUser(User user, Set<UserRol> userRoles) throws Exception {

        /*todo esto se puede mejorar bastante*/

        User userLocal = userRepository.findByUsername(user.getUsername());
        if (userLocal != null) {
            System.out.println("User already exists");
            throw new Exception("User already exists");
        }
        else {
            for (UserRol userRole : userRoles) {
                rolRepository.save(userRole.getRol());
            }
            user.getUserRoles().addAll(userRoles);
            userLocal = userRepository.save(user);
        }
        return userLocal;
    }

    @Override
    public User getUserByUsername(String username) throws Exception {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUserById(Long idUser) throws Exception {
        userRepository.deleteById(idUser);
    }


}
