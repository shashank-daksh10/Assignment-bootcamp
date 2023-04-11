package com.example.jpa3Assignment.question2.entity;

import com.example.jpa3Assignment.question2.entity.AuthorOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class BookOne {
    @Id
    private int bookOne;



    private String BookName;

    @JoinColumn(name = "author_one")
    @OneToOne()
    private AuthorOne authorOne;

    public BookOne() {
    }

    public BookOne(int bookOne, AuthorOne authorOne,String BookName) {
        this.bookOne = bookOne;
        this.authorOne = authorOne;
        this.BookName=BookName;
    }

    public int getBookOne() {
        return bookOne;
    }

    public void setBookOne(int bookOne) {
        this.bookOne = bookOne;
    }

    public AuthorOne getAuthorOne() {
        return authorOne;
    }

    public void setAuthorOne(AuthorOne authorOne) {
        this.authorOne = authorOne;
    }
    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    @Override
    public String toString() {
        return "BookOne{" +
                "bookOne=" + bookOne +
                ", BookName='" + BookName + '\'' +
                ", authorOne=" + authorOne +
                '}';
    }
}
