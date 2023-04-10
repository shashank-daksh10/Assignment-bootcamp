package com.example.InherintanceMapping.pertable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class CreditPerTable extends PaymentPerTable {
    @Id
     int id;
    @Column(name = "credit_no")
    String creditNo;

    public CreditPerTable() {

    }

    public CreditPerTable(String creditNo) {
        this.creditNo = creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo;
    }
}
