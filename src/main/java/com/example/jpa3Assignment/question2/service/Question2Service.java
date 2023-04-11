package com.example.jpa3Assignment.question2.service;

import com.example.jpa3Assignment.question2.entity.AuthorOne;
import com.example.jpa3Assignment.question2.entity.BookOne;
import com.example.jpa3Assignment.question2.repos.AuthorOneRepo;
import com.example.jpa3Assignment.question2.repos.BookOneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Question2Service {
    @Autowired
    BookOneRepo bookOneRepo;

    @Autowired
    AuthorOneRepo authorOneRepo;

    public void addAuthor(AuthorOne au){
        authorOneRepo.save(au);
    }

    public void addBook(BookOne bu){
        bookOneRepo.save(bu);
    }

    public List<Object> getAuthor(){
        List<Object>ans=new ArrayList<>();
        ans.addAll(authorOneRepo.findAll());
        return ans;
    }

    public List<Object>getBook(){
        List<Object>ans=new ArrayList<>();
        ans.addAll(bookOneRepo.findAll());
        return ans;
    }
}
