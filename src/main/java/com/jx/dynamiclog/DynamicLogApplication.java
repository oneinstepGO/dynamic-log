package com.jx.dynamiclog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamicLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicLogApplication.class, args);
        System.out.println("start Application success!!!!");
    }

}
