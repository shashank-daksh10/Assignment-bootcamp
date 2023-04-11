package com.example.jpa3Assignment.question1.controller;

import com.example.jpa3Assignment.question1.entity.Author;
import com.example.jpa3Assignment.question1.entity.Subject;
import com.example.jpa3Assignment.question1.service.Question1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question1Controller {
    @Autowired
    Question1Service question1Service;

    @PostMapping("/ques1/author")
    public String add(@RequestBody Author au){
        question1Service.addAuthor(au);
        return "author added";
    }

    @PostMapping("/ques1/subject")
    public String add1(@RequestBody Subject su){
        question1Service.addSubject(su);
        return "author added";
    }

}
