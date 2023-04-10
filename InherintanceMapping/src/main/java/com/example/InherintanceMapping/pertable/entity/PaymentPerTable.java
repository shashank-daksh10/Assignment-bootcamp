package com.example.InherintanceMapping.pertable.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PaymentPerTable {

    @Id
    int id;
    int amount;

    public PaymentPerTable() {
    }

    public PaymentPerTable(int id, int amount) {
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
