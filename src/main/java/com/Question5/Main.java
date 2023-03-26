package com.Question5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext application = SpringApplication.run(Main.class,args);
        profitLoss pl= application.getBean(profitLoss.class);
        System.out.println(pl);//Question4

        int result =pl.WinOrloose(50,44);
        System.out.println(result);
    }
}
