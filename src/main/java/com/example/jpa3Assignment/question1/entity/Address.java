package com.example.jpa3Assignment.question1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name = "street_number")
    private String StreetNumber;
    private String Location;
    private String State;


    public Address() {
    }

    public Address(String streetNumber, String location, String state) {
        StreetNumber = streetNumber;
        Location = location;
        State = state;
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        StreetNumber = streetNumber;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "StreetNumber='" + StreetNumber + '\'' +
                ", Location='" + Location + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
