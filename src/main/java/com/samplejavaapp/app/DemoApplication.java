package com.samplejavaapp.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Java App!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
