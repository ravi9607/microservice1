package com.example.user1service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class User1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(User1ServiceApplication.class, args);
    }

}
