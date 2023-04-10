package com.example.InherintanceMapping.componentMapping.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Pay {

    private int BasicSalary;

    private int BonusSalary;

    private int TaxAmount;

    private int specialAllowanceSalary;

    public Pay() {
    }

    public Pay(int basicSalary, int bonusSalary, int taxAmount, int specialAllowanceSalary) {
        BasicSalary = basicSalary;
        BonusSalary = bonusSalary;
        TaxAmount = taxAmount;
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    public int getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        BasicSalary = basicSalary;
    }

    public int getBonusSalary() {
        return BonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        BonusSalary = bonusSalary;
    }

    public int getTaxAmount() {
        return TaxAmount;
    }

    public void setTaxAmount(int taxAmount) {
        TaxAmount = taxAmount;
    }

    public int getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(int specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "BasicSalary=" + BasicSalary +
                ", BonusSalary=" + BonusSalary +
                ", TaxAmount=" + TaxAmount +
                ", specialAllowanceSalary=" + specialAllowanceSalary +
                '}';
    }
}
