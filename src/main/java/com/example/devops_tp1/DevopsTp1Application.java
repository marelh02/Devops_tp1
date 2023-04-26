package com.example.devops_tp1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevopsTp1Application {

    public static void main(String[] args) {
        SpringApplication.run(DevopsTp1Application.class, args);
    }

    @Bean
    CommandLineRunner test(){
        return (args -> {
            System.out.println("My first modification, to the index file");
            System.out.println("My second modification, to the index file");
            System.out.println("My third modification, to the index file");

        });
    }
}
