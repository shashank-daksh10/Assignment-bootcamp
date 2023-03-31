package com.example.Restapi1.Question1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class getMethod {
    @GetMapping("/path/{name}")
    public String get(@PathVariable String name){ //
        return "hello Mr "+" "+name;
    }
    @GetMapping("/hello")
    public String getWelcome(){
        return "Welcome to the Spring Boot";
    }
}
