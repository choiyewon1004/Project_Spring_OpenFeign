package com.example.project_spring_openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProjectSpringOpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringOpenFeignApplication.class, args);
    }

}
