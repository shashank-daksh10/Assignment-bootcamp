package com.example.jpa3Assignment.question1.service;

import com.example.jpa3Assignment.question1.entity.Author;
import com.example.jpa3Assignment.question1.entity.Subject;
import com.example.jpa3Assignment.question1.repo.AuthorRepo;
import com.example.jpa3Assignment.question1.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Question1Service {

    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    SubjectRepo subjectRepo;


    public void addAuthor(Author au){
        authorRepo.save(au);
    }

    public void addSubject(Subject su){
        subjectRepo.save(su);
    }
}
