package com.example.jpa3Assignment.question3.controller;

import com.example.jpa3Assignment.question3.entity.AuthorTwo;
import com.example.jpa3Assignment.question3.entity.BookTwo;
import com.example.jpa3Assignment.question3.service.Question3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question3Controller {
    @Autowired
    Question3Service question3Service;

    @PostMapping("many/author")
    public String add(@RequestBody AuthorTwo au){
        question3Service.addAuthor(au);
        return "author added";
    }

    @PostMapping("many/book")
    public String add1(@RequestBody BookTwo bu){
        question3Service.addBook(bu);
        return "book added";
    }
}
