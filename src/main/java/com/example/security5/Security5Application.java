package com.example.security5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.example.security5.mapper")
@SpringBootApplication
public class Security5Application {

    public static void main(String[] args) {
        SpringApplication.run(Security5Application.class, args);
    }

}
