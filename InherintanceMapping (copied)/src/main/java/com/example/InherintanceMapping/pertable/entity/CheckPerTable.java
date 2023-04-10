package com.example.InherintanceMapping.pertable.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class CheckPerTable extends PaymentPerTable {
     @Id
    int id;
    @Column(name = "check_no")
    String checkNo;

    public CheckPerTable() {

    }

    public CheckPerTable(String checkNo) {
        this.checkNo = checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }
}
