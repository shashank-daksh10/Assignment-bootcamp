package com.example.InherintanceMapping.joined.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class CreditJoined extends PaymentJoined {

    @Column(name = "credit_no")
    String creditNo;

    public CreditJoined() {

    }

    public CreditJoined(String creditNo) {
        this.creditNo = creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo;
    }
}
