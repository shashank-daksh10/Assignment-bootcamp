package com.example.jpa3Assignment.question3.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AuthorTwo {
    @Id
    int authorTwoId;
    private String name;

    @OneToMany(mappedBy = "authorTwo",cascade = CascadeType.ALL)
    List<BookTwo> bookTwoList=new ArrayList<>();

    public AuthorTwo() {
    }

    public AuthorTwo(int authorTwoId, String name, List<BookTwo> bookTwoList) {
        this.authorTwoId = authorTwoId;
        this.name = name;
        this.bookTwoList = bookTwoList;
    }

    public int getAuthorTwoId() {
        return authorTwoId;
    }

    public void setAuthorTwoId(int authorTwoId) {
        this.authorTwoId = authorTwoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookTwo> getBookTwoList() {
        return bookTwoList;
    }

    public void setBookTwoList(List<BookTwo> bookTwoList) {
        this.bookTwoList = bookTwoList;
    }

    @Override
    public String toString() {
        return "AuthorTwo{" +
                "authorTwoId=" + authorTwoId +
                ", name='" + name + '\'' +
                ", bookTwoList=" + bookTwoList +
                '}';
    }
}
