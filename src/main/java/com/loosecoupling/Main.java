package com.loosecoupling;

public class Main {
    public static void main(String[] args) {
        ProfitLoss pl = new ProfitLoss(new Profit());
        ProfitLoss pl2= new ProfitLoss(new Loss());

        int add=pl.WinOrloose(3,4);
        int subtract=pl2.WinOrloose(4,3);

        System.out.println(add);
        System.out.println(subtract);

    }
}
