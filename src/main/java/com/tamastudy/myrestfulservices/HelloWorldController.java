package com.tamastudy.myrestfulservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world (endpoint)
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello world";
    }
}
