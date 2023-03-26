package com.Question3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext application = SpringApplication.run(Main.class,args);
        ProfitLoss pl= application.getBean(ProfitLoss.class);
        System.out.println(pl);

        int result =pl.WinOrloose(33,44);
        System.out.println(result);
    }
}
