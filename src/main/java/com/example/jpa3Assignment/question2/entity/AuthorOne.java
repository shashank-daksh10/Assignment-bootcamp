package com.example.jpa3Assignment.question2.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AuthorOne {
    @Id
    private int authorOne;



    @OneToOne(mappedBy = "authorOne",cascade = CascadeType.ALL)
    private BookOne bookOne;

    public AuthorOne() {
    }

    public AuthorOne(int authorOne, BookOne bookOne) {
        this.authorOne = authorOne;
        this.bookOne = bookOne;
    }

    public int getAuthorOne() {
        return authorOne;
    }

    public void setAuthorOne(int authorOne) {
        this.authorOne = authorOne;
    }

    public BookOne getBookOne() {
        return bookOne;
    }

    public void setBookOne(BookOne bookOne) {
        this.bookOne = bookOne;
    }

    @Override
    public String toString() {
        return "AuthorOne{" +
                "authorOne=" + authorOne +
                ", bookOne=" + bookOne +
                '}';
    }
}
