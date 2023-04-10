package com.example.InherintanceMapping.Singletable.entity;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Check extends Payment {
    @Column(name = "check_no")
    String checkNo;

    public Check() {

    }

    public Check(String checkNo) {
        this.checkNo = checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }
}
