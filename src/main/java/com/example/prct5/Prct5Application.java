package com.example.prct5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Prct5Application {

    public static void main(String[] args) {
        SpringApplication.run(Prct5Application.class, args);
    }

}
