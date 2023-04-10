package com.example.InherintanceMapping.componentMapping.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;

    private String name;

    @Embedded
    Address ad;

    public Employee() {
    }

    public Employee(int id, String name, Address ad) {
        this.id = id;
        this.name = name;
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAd() {
        return ad;
    }

    public void setAd(Address ad) {
        this.ad = ad;
    }
}
