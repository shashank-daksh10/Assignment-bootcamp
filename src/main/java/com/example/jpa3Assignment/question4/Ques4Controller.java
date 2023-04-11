package com.example.jpa3Assignment.question4;

import com.example.jpa3Assignment.question1.entity.Address;
import com.example.jpa3Assignment.question4.entity.AuthorThree;
import com.example.jpa3Assignment.question4.entity.BookThree;
import com.example.jpa3Assignment.question4.repos.AuthorThreeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ques4Controller {

    @Autowired
    AuthorThreeRepo authorThreeRepo;

    @GetMapping("/ques4")
    public void addAuthor(){
        Address address = new Address();
        address.setStreetNumber("5");
        address.setLocation("Noida");
        address.setState("UP");

        AuthorThree author1 = new AuthorThree();
        author1.setAddress(address);

        AuthorThree author2 = new AuthorThree();
        author2.setAddress(address);

        AuthorThree author3 = new AuthorThree();
        author3.setAddress(address);

        BookThree book1 = new BookThree();
        book1.setBookName("Maths");

        BookThree book2 = new BookThree();
        book2.setBookName("English");

        BookThree book3 = new BookThree();
        book3.setBookName("Hindi");

        author1.setBookThreeList(List.of(book1,book2));
        author2.setBookThreeList(List.of(book2,book3));
        author3.setBookThreeList(List.of(book1,book3));

        book1.setAuthorThree(List.of(author1,author2));
        book2.setAuthorThree(List.of(author2,author3));
        book3.setAuthorThree(List.of(author1,author3));

        authorThreeRepo.save(author1);
        authorThreeRepo.save(author2);
        authorThreeRepo.save(author3);
    }
}
