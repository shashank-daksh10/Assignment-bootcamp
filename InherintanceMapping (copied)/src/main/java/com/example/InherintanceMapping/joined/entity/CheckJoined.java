package com.example.InherintanceMapping.joined.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class CheckJoined extends PaymentJoined {
    @Column(name = "check_no")
    String checkNo;

    public CheckJoined() {

    }

    public CheckJoined(String checkNo) {
        this.checkNo = checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }
}
