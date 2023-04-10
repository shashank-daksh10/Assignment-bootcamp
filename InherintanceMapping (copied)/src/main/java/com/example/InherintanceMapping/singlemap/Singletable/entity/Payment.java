package com.example.InherintanceMapping.singlemap.Singletable.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "mode",discriminatorType = DiscriminatorType.STRING)
public abstract class Payment {

    @Id
    int id;
    int amount;

    public Payment() {
    }

    public Payment(int id, int amount) {
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
