package com.study.mycontact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello_world")
    public String helloWorld() {
        return "HelloWorld";
    }
}
