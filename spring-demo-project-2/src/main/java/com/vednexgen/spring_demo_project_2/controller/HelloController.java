package com.vednexgen.spring_demo_project_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class HelloController {

        @GetMapping("/hii")
        public String sayHello() {
            return "Hello, Spring Boot!";
        }
    }

