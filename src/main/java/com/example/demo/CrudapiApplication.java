package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CrudapiApplication {

    public static void main(String[] args) {
        // Force the application to start on port 8080
        new SpringApplicationBuilder(CrudapiApplication.class)
            .properties("server.port=8080")
            .run(args);
    }
}
