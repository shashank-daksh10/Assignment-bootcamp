package com.example.jpa3Assignment.question3.service;

import com.example.jpa3Assignment.question3.entity.AuthorTwo;
import com.example.jpa3Assignment.question3.entity.BookTwo;
import com.example.jpa3Assignment.question3.repos.AuthorTwoRepo;
import com.example.jpa3Assignment.question3.repos.BookTwoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Question3Service {
    @Autowired
    BookTwoRepo bookTwoRepo;

    @Autowired
    AuthorTwoRepo authorTwoRepo;

    public void addAuthor(AuthorTwo au){
        authorTwoRepo.save(au);
    }

    public void addBook(BookTwo bu){
        bookTwoRepo.save(bu);
    }
}
