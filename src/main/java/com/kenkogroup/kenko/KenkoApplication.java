package com.kenkogroup.kenko;

import com.kenkogroup.kenko.user.entity.User;
import com.kenkogroup.kenko.user.repository.UserRepository;
import com.kenkogroup.kenko.user.service.UserService;
import com.kenkogroup.kenko.user.controller.UserController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@ComponentScan(basePackageClasses = UserService.class)
@ComponentScan(basePackageClasses = UserRepository.class)
@ComponentScan(basePackageClasses = UserController.class)
@EntityScan("com.kenkogroup.kenko.user")

@SpringBootApplication
public class KenkoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KenkoApplication.class, args);
    }

}
