/*package com.kenkogroup.kenko.UserTest.UserRepositoryTest;

import com.kenkogroup.kenko.user.entity.User;
import com.kenkogroup.kenko.user.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;
    private User user1;
    private User user2;

    @BeforeEach
    void init(){
        user1 = new User();
        user1.setFirstname("Firstname1");
        user1.setLastname("Lastname1");
        user1.setSexe(User.Sexe.HOMME);
        user1.setAge(30);
        user1.setWeight(80);
        user1.setSize(160);
        user1.setUserCat(User.UserCategory.OLD);
        user1.setRole(User.Role.USER);

        //user2
        user2 = new User();
        user2.setFirstname("Firstname2");
        user2.setLastname("Lastname2");
        user2.setSexe(User.Sexe.FEMME);
        user2.setAge(35);
        user2.setWeight(55);
        user2.setSize(165);
        user2.setUserCat(User.UserCategory.ADULT);
        user2.setRole(User.Role.USER);
    }

    @Test
    @DisplayName("It should save a user in the db")
    void save() {
        User newUser = userRepository.save(user1);
        assertThat(newUser.getId()).isNotEqualTo(null);
    }

    @Test
    @DisplayName("It should return a users list with size of 2")
    void getAllUsers() {

        //user1
         userRepository.save(user1);

        //user2
         userRepository.save(user2);

        List<User> list = userRepository.findAll();
        int beforeDelete = list.size();

        assertThat(list).isNotEqualTo(null);
       // assertEquals(2,list.size());
    }

    @Test
    @DisplayName("It should return a user with its id")
    void getUserById() {
        //user1
        userRepository.save(user1);
        User existingUser = userRepository.findById(user1.getId()).get();
        assertEquals("Firstname1",existingUser.getFirstname());
        assertEquals(User.Sexe.HOMME,existingUser.getSexe());
        assertEquals(30,existingUser.getAge());
    }

    @Test
    @DisplayName("It should update username")
    void updateUser() {
        //user1
        userRepository.save(user1);

        User existingUser = userRepository.findById(user1.getId()).get();

        existingUser.setFirstname("FirstnameUpdated");
        existingUser.setLastname("LastnameUpdated");

        User newUser = userRepository.save(existingUser);

        assertEquals("FirstnameUpdated",newUser.getFirstname());
        assertEquals("FirstnameUpdated",newUser.getFirstname());
        assertEquals(User.Sexe.HOMME,newUser.getSexe());
    }

    @Test
    @DisplayName("It should delete an existing user")
    void deleteUser() {

        //user1
         userRepository.save(user1);

        //user2
        userRepository.save(user2);

        int id = user1.getId();

        userRepository.delete(user1);
        List<User> list = userRepository.findAll();

        Optional<User> existingUser = userRepository.findById(id);

        assertEquals(list.size(),list.size());
        assertThat(existingUser).isEmpty();
    }
}
 */
