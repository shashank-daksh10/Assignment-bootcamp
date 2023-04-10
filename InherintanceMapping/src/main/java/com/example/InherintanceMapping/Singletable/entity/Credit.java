package com.example.InherintanceMapping.Singletable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("cd")
public class Credit extends Payment {

    @Column(name = "credit_no")
    String creditNo;

    public Credit() {

    }

    public Credit(String creditNo) {
        this.creditNo = creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo;
    }
}
