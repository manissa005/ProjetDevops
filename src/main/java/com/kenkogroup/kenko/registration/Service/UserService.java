package com.kenkogroup.kenko.registration.Service;

import com.kenkogroup.kenko.registration.Dto.UserDTO;
import com.kenkogroup.kenko.registration.Entity.User;

import java.util.List;

public interface UserService {

    String addUser(UserDTO userDTO);

    List<User> getAllUsers();
}