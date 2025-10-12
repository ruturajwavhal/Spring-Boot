package com.vednex.spring_demo_program_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class HelloController {

        @GetMapping("/hello")
        public String sayHello() {

            return "Hello, Spring Boot!";
        }

        @GetMapping("/hello/{name}")
        public String sayHelloToName(@PathVariable String name) {
            return "Hello, " + name + " ! ";
        }

    }

