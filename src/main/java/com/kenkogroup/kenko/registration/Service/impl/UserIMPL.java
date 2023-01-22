package com.kenkogroup.kenko.registration.Service.impl;

import com.kenkogroup.kenko.registration.Dto.UserDTO;
import com.kenkogroup.kenko.registration.Entity.User;
import com.kenkogroup.kenko.registration.Repo.UserRepo;
import com.kenkogroup.kenko.registration.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(
                userDTO.getUserid(),
                userDTO.getUsername(),
                userDTO.getAddress(),
                userDTO.getPassword()

        );
        userRepo.save(user);
        return user.getUsername();
    }
    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
