/*package com.kenkogroup.kenko.UserTest.UserServiceTest;

import com.kenkogroup.kenko.user.entity.User;
import com.kenkogroup.kenko.user.exception.UserNullException;
import com.kenkogroup.kenko.user.repository.UserRepository;
import com.kenkogroup.kenko.user.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class UserServiceTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserService userService;

    private User user1;
    private User user2;

    @BeforeEach
    void init(){
        user1 = new User();
        user1.setId(1);
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
        user2.setId(2);
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
    @DisplayName("Should save the user into db")
    void save(){
        when(userRepository.save(any(User.class))).thenReturn(user1);

        User newUser = userService.saveUser(user1);

        assertNotNull(newUser);
        assertThat(newUser.getFirstname()).isEqualTo("Firstname1");
    }

    @Test
    @DisplayName("Should return all users")
    void getAllUsers(){

        List <User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);

        when(userRepository.findAll()).thenReturn(list);

        List <User> users = userService.getUsers();

        assertEquals(list.size(),users.size());

        assertNotNull(users);
    }

    @Test
    @DisplayName("Should return the user updated")
    void getuserId(){

        when(userRepository.findById(anyInt())).thenReturn(Optional.of(user1));

        User existingUser = userService.getUserbyId(1);

        assertNotNull(existingUser);
        assertThat(existingUser.getId()).isEqualTo(1);
    }

    @Test
    @DisplayName("Should return the user updated")
    void updateUser () throws UserNullException {

        when(userRepository.findById(anyInt())).thenReturn(Optional.of(user1));
        when(userRepository.save(any(User.class))).thenReturn(user1);

        user1.setFirstname("NameFirst");

        User updateUser = userService.updateUserbyId(user1,1);

        assertNotNull(updateUser);
        assertEquals("NameFirst",updateUser.getFirstname());
    }
    @Test
    @DisplayName("Should delete the user")
    void deleteUser(){

        when(userRepository.findById(anyInt())).thenReturn(Optional.of(user1));
        doNothing().when(userRepository).delete(any(User.class));

        userService.deleteUserbyId(1);

        verify(userRepository, times(1)).deleteById(1);
    }
}
*/