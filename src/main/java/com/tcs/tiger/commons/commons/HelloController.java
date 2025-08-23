package com.tcs.tiger.commons.commons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello, Spring @@@@@ Boots!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Welcome to Spring Boot!";
    }
}
