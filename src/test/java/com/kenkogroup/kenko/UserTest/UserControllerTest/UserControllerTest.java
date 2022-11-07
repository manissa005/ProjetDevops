package com.kenkogroup.kenko.UserTest.UserControllerTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kenkogroup.kenko.user.entity.User;
import com.kenkogroup.kenko.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest
public class UserControllerTest {

    @MockBean
    private UserService userService;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldFetchAllUsers() throws Exception {
        User user1 = new User();
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
        User user2 = new User();
        user2.setId(2);
        user2.setFirstname("Firstname2");
        user2.setLastname("Lastname2");
        user2.setSexe(User.Sexe.FEMME);
        user2.setAge(35);
        user2.setWeight(55);
        user2.setSize(165);
        user2.setUserCat(User.UserCategory.ADULT);
        user2.setRole(User.Role.USER);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);

        when(userService.getUsers()).thenReturn(list);

        this.mockMvc.perform(get("/users"))
                .andExpect(status().isOk());
    }

//    @Test
//    void shouldCreateNewUser() throws Exception {
//        User user1 = new User();
//        user1.setId(100);
//        user1.setFirstname("Firstname1Controller");
//        user1.setLastname("Lastname1Controller");
//        user1.setSexe(User.Sexe.HOMME);
//        user1.setAge(30);
//        user1.setWeight(80);
//        user1.setSize(160);
//        user1.setUserCat(User.UserCategory.OLD);
//        user1.setRole(User.Role.USER);
//
//        when(userService.saveUser(any(User.class))).thenReturn(user1);
//
//        this.mockMvc.perform(post("/adduser").contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content(objectMapper.writeValueAsString(user1)))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.firstname",is(user1.getFirstname())))
//                .andExpect(jsonPath("$.lastname",is(user1.getLastname())))
//                .andExpect(jsonPath("$.age",is(user1.getAge())))
//                .andExpect(jsonPath("$.sexe",is(user1.getSexe())))
//                .andExpect(jsonPath("$.weight",is(user1.getWeight())))
//                .andExpect(jsonPath("$.size",is(user1.getSize())))
//                .andExpect(jsonPath("$.userCat",is(user1.getUserCat())))
//                .andExpect(jsonPath("$.role",is(user1.getRole())));
//    }


//    @Test
//    void shouldFetchUserById() throws Exception {
//        User user1 = new User();
//        user1.setId(19);
//        user1.setFirstname("Firstname1");
//        user1.setLastname("Lastname1");
//        user1.setSexe(User.Sexe.HOMME);
//        user1.setAge(30);
//        user1.setWeight(80);
//        user1.setSize(160);
//        user1.setUserCat(User.UserCategory.OLD);
//        user1.setRole(User.Role.USER);
//
//        when(userService.getUserbyId(anyInt())).thenReturn(user1);
//
//        this.mockMvc.perform(get("/user/{id}",19))
//                .andExpect(status().isOk());
//    }

}
