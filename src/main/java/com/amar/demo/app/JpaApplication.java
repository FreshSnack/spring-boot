package com.amar.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author dingmx
 * @date 2019/1/8 21:48
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.amar.demo.repository")
@EntityScan("com.amar.demo.entity")
public class JpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
}
