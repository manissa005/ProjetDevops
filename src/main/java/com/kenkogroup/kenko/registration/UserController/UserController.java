package com.kenkogroup.kenko.registration.UserController;

import com.kenkogroup.kenko.registration.Dto.UserDTO;
import com.kenkogroup.kenko.registration.Entity.User;
import com.kenkogroup.kenko.registration.Service.UserService;
import com.sun.source.tree.BreakTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin ("*")
@RequestMapping("api/v1/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDTO){
        String id = userService.addUser(userDTO);
        return id;


    }

    @GetMapping(path = "/login/{email}/{password}")
    public String loginUser(@PathVariable String email,@PathVariable String password){
        List<User> users = new ArrayList<>();
        users = userService.getAllUsers();
        String response = "failed !";
        for (User user :users) {
            System.out.println(user.getAddress());
            if( user.getAddress().equals(email) && user.getPassword().equals(password)) {
                response = "Login succesfually";
                break;
            }

        }
        return response;


    }

}
