package com.kenkogroup.kenko.user.controller;

import com.kenkogroup.kenko.user.entity.User;
import com.kenkogroup.kenko.user.exception.UserNullException;
import com.kenkogroup.kenko.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/user/adduser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @PostMapping("/user/addusers")
    public List<User> addUsers(@RequestBody List<User> users){ return service.saveUsers(users); }

    @GetMapping("/user/id/{id}")
    public User findUserById(@PathVariable int id){
        return service.getUserbyId(id);
    }

    @GetMapping("/users/firstname/{firstname}")
    public List<User> findUserByFirstname(@PathVariable String firstname){
        return service.getUserByFirstname(firstname);
    }

    @GetMapping("/users/lastname/{lastname}")
    public List<User> findUserByLastname(@PathVariable String lastname){
        return service.getUserByLastname(lastname);
    }

    @GetMapping("/users/age/{age}")
    public List<User> findUserByAge(@PathVariable int age){
        return service.getUserByAge(age);
    }

    @GetMapping("/users/size/{size}")
    public List<User> findUserBySize(@PathVariable float size){
        return service.getUserBySize(size);
    }

    @GetMapping("/users/weight/{weight}")
    public List<User> findUserByWeight(@PathVariable float weight){
        return service.getUserByWeight(weight);
    }

    @GetMapping("/users/sexe/{sexe}")
    public List<User> findUserBySexe(@PathVariable User.Sexe sexe){
        return service.getUserBySexe(sexe);
    }

    @GetMapping("/users/userCategory/{userCategory}")
    public List<User> findUserByUserCategory(@PathVariable User.UserCategory userCategory){
        return service.getUserByUserCat(userCategory);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }

    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUserbyId(id);
    }

    @PutMapping("/user/update/{id}")
    public User updateUser(@RequestBody User user,@PathVariable int id) throws UserNullException {
        return service.updateUserbyId(user,id);
    }

    /*@PostMapping("/user/recipe")
    public User addPersonalizedRecipe(@RequestBody Recipe recipe,@PathVariable int id){
        return service.saveRecipe(Recipe,id);
    }*/
}
