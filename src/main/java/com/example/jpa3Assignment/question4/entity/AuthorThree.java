package com.example.jpa3Assignment.question4.entity;

import com.example.jpa3Assignment.question1.entity.Address;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AuthorThree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Embedded
    Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "joinTable",joinColumns = @JoinColumn(name = "authorId",referencedColumnName = "id"),
                            inverseJoinColumns = @JoinColumn(name = "bookId",referencedColumnName = "id"))
    private List<BookThree> bookThreeList=new ArrayList<>();

    public List<BookThree> getBookThreeList() {
        return bookThreeList;
    }

    public void setBookThreeList(List<BookThree> bookThreeList) {
        this.bookThreeList = bookThreeList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}