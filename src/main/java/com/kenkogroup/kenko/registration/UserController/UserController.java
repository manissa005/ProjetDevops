package com.kenkogroup.kenko.registration.UserController;

import com.kenkogroup.kenko.registration.Dto.UserDTO;
import com.kenkogroup.kenko.registration.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDTO){
        String id = userService.addUser(userDTO);
        return id;


    }

}
