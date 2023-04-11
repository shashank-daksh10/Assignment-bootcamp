package com.example.jpa3Assignment.question1.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {

    @Id
    private int AuthorId;
    @Embedded
    private Address address;


   @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Subject>subjects=new ArrayList<>();

    public Author() {
    }

    public Author(int AuthorId, Address address, List<Subject> subjects) {
        this.AuthorId = AuthorId;
        this.address = address;
        this.subjects = subjects;
    }

    public int getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(int AuthorId) {
        this.AuthorId = AuthorId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorId=" + AuthorId +
                ", address=" + address +
                ", subjects=" + subjects +
                '}';
    }
}
