package com.example.eurekamaster1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMaster1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMaster1Application.class, args);
    }
}
