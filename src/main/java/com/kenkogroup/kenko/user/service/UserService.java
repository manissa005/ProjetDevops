/*package com.kenkogroup.kenko.user.service;

import com.kenkogroup.kenko.user.entity.User;
import com.kenkogroup.kenko.user.exception.UserNullException;
import com.kenkogroup.kenko.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User  getUserbyId(int id){
        return repository.findById(id).orElse(null);
    }

    public List<User> getUserByFirstname(String firstname){
        return repository.findByFirstname(firstname);
    }
    public List<User> getUserByLastname(String lastname) {
        return repository.findByLastname(lastname);
    }

    public List<User> getUserByAge(int age) {
        return repository.findByAge(age);
    }

    public List<User> getUserBySize(float size) {
        return repository.findBySize(size);
    }
    public List<User> getUserBySexe(User.Sexe sexe) {
        return repository.findBySexe(sexe);
    }
    public List<User> getUserByUserCat(User.UserCategory userCat) {
        return repository.findByUserCat(userCat);
    }
    public List<User> getUserByWeight(float weight) {
        return repository.findByWeight(weight);
    }
    public String deleteUserbyId(int id){
        repository.deleteById(id);
        return "User deleted succesfully !!" + id;
    }

    public User updateUserbyId(User user, int id) throws UserNullException {
        User existingUser = repository.findById(id).orElse(null);
        if (existingUser != null) {
            if (user.getFirstname() != null) {
                existingUser.setFirstname(user.getFirstname());
            } else {
                existingUser.setFirstname(existingUser.getFirstname());
            }
            if (user.getLastname() != null) {
                existingUser.setLastname(user.getLastname());
            } else {
                existingUser.setFirstname(existingUser.getLastname());
            }
            if (user.getAge() > 0) {
                existingUser.setAge(user.getAge());
            } else {
                existingUser.setAge(existingUser.getAge());
            }
            if (user.getSexe() != null) {
                existingUser.setSexe(user.getSexe());
            } else {
                existingUser.setSexe(existingUser.getSexe());
            }
            if (user.getUserCat() != null) {
                existingUser.setUserCat(user.getUserCat());
            } else {
                existingUser.setUserCat(existingUser.getUserCat());
            }
            if (user.getSize() > 0) {
                existingUser.setSize(user.getSize());
            } else {
                existingUser.setSize(existingUser.getSize());
            }
            if (user.getWeight() > 0) {
                existingUser.setWeight(user.getWeight());
            }else {
                existingUser.setWeight(existingUser.getWeight());
            }
            return repository.save(existingUser);
        } else {
            throw new UserNullException("User is not existing");
        }
    }

    /*public Recipe saveRecipe(Recipe recipe){
        return repository.save(recipe,id);
    }*/

//}
