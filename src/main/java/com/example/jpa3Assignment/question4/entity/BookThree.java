package com.example.jpa3Assignment.question4.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookThree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String BookName;

    @ManyToMany(mappedBy = "bookThreeList")
    private List<AuthorThree> authorThree=new ArrayList<>();

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public List<AuthorThree> getAuthorThree() {
        return authorThree;
    }

    public void setAuthorThree(List<AuthorThree> authorThree) {
        this.authorThree = authorThree;
    }
}
