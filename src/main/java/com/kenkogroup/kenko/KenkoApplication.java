package com.kenkogroup.kenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kenkogroup.Controller.RecipeController;
import com.kenkogroup.impl.RecipeServiceImpl;
import com.kenkogroup.service.RecipeService;

@SpringBootApplication
@ComponentScan(basePackageClasses = RecipeController.class)
@ComponentScan(basePackageClasses = RecipeService.class)
@ComponentScan(basePackageClasses = RecipeServiceImpl.class)
@EntityScan("com.kenkogroup.entities")
@EnableJpaRepositories("com.kenkogroup.repositories")
public class KenkoApplication {

    public static void main(String[] args) {
    	System.out.println("je suis dans le main");
        SpringApplication.run(KenkoApplication.class, args);
    }
}
