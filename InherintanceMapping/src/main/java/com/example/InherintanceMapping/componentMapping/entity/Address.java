package com.example.InherintanceMapping.componentMapping.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    String city;
    String flat;
    String area;

    public Address() {
    }

    public Address(String city, String flat, String area) {
        this.city = city;
        this.flat = flat;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
