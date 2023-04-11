package com.example.jpa3Assignment.question2.controller;

import com.example.jpa3Assignment.question2.entity.AuthorOne;
import com.example.jpa3Assignment.question2.entity.BookOne;
import com.example.jpa3Assignment.question2.service.Question2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Question2Controller {

    @Autowired
    Question2Service question2Service;
    @PostMapping("/one/author")
    public String add(@RequestBody AuthorOne a){
        question2Service.addAuthor(a);
        return "author added";
    }
    @PostMapping("/one/book")
    public String add1(@RequestBody BookOne b){
        question2Service.addBook(b);
        return "book added";
    }

    @GetMapping("/one/author")
    public List<Object> get1(){
      return  question2Service.getAuthor();
    }

    @GetMapping("/one/book")
    public List<Object> get(){
        return  question2Service.getBook();
    }
}

