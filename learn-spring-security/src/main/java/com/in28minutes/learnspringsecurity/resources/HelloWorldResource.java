package com.in28minutes.learnspringsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("/hello")
    public String sayHelloWorld(){
        return "Hello World";
    }
}
