package com.kenkogroup.kenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.DriverManager;

@SpringBootApplication
public class KenkoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KenkoApplication.class, args);

    }
}