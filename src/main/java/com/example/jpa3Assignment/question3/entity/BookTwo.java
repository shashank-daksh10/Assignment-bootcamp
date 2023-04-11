package com.example.jpa3Assignment.question3.entity;

import com.example.jpa3Assignment.question3.entity.AuthorTwo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BookTwo {
    @Id
    private int id;

    String BookName;

    @JoinColumn(name = "author_two_id")
    @ManyToOne()
    private AuthorTwo authorTwo;

    public BookTwo() {
    }

    public BookTwo(int id, String bookName, AuthorTwo authorTwo) {
        this.id = id;
        BookName = bookName;
        this.authorTwo = authorTwo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public AuthorTwo getAuthorTwo() {
        return authorTwo;
    }

    public void setAuthorTwo(AuthorTwo authorTwo) {
        this.authorTwo = authorTwo;
    }

    @Override
    public String toString() {
        return "BookTwo{" +
                "id=" + id +
                ", BookName='" + BookName + '\'' +
                ", authorTwo=" + authorTwo +
                '}';
    }
}
