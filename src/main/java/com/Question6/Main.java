package com.Question6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(Main.class);
        ProfitLoss pd = app.getBean(ProfitLoss.class);
        int ans =pd.calculation(777,100);
        System.out.println(ans);

    }
}
