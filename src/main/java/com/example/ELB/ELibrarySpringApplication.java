package com.example.ELB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ELibrarySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ELibrarySpringApplication.class, args);
    }

}

