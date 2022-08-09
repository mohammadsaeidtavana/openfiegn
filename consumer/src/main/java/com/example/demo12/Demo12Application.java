package com.example.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Demo12Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo12Application.class, args);
    }

}
