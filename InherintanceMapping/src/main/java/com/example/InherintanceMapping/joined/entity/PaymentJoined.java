package com.example.InherintanceMapping.joined.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="id")
public abstract class PaymentJoined {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int amount;

    public PaymentJoined() {
    }

    public PaymentJoined(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }
}
