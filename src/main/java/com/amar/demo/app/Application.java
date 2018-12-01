package com.amar.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan("com.amar")
public class Application {

    @RequestMapping("/")
    public String welcome() { return "Welcome Spring Boot"; }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
