/*package com.kenkogroup.kenko.user.controller;

import com.kenkogroup.kenko.user.entity.User;
import com.kenkogroup.kenko.user.exception.UserNullException;
import com.kenkogroup.kenko.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/user/adduser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/user/addusers")
    public List<User> addUsers(@RequestBody List<User> users){ return service.saveUsers(users); }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/id/{id}")
    public User findUserById(@PathVariable int id){
        return service.getUserbyId(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/firstname/{firstname}")
    public List<User> findUserByFirstname(@PathVariable String firstname){
        return service.getUserByFirstname(firstname);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/lastname/{lastname}")
    public List<User> findUserByLastname(@PathVariable String lastname){
        return service.getUserByLastname(lastname);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/age/{age}")
    public List<User> findUserByAge(@PathVariable int age){
        return service.getUserByAge(age);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/size/{size}")
    public List<User> findUserBySize(@PathVariable float size){
        return service.getUserBySize(size);
    }

    @GetMapping("/users/weight/{weight}")
    public List<User> findUserByWeight(@PathVariable float weight){
        return service.getUserByWeight(weight);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/sexe/{sexe}")
    public List<User> findUserBySexe(@PathVariable User.Sexe sexe){
        return service.getUserBySexe(sexe);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/userCategory/{userCategory}")
    public List<User> findUserByUserCategory(@PathVariable User.UserCategory userCategory){
        return service.getUserByUserCat(userCategory);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUserbyId(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/user/update/{id}")
    public User updateUser(@RequestBody User user,@PathVariable int id) throws UserNullException {
        return service.updateUserbyId(user,id);
    }

    @RequestMapping("/")
    public String hello()
    {
        return "Hello javaTpoint";
    }

    /*@PostMapping("/user/recipe")
    public User addPersonalizedRecipe(@RequestBody Recipe recipe,@PathVariable int id){
        return service.saveRecipe(Recipe,id);
    }*/
//}
