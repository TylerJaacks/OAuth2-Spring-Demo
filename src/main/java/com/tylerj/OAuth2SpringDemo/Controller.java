package com.tylerj.OAuth2SpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, world!";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "To view this content you must be logged in.";
    }
}
