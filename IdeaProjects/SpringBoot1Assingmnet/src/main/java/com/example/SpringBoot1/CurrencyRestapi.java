package com.example.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringBoot1.Currency;

@RestController
public class CurrencyRestapi {
    @Autowired
        Currency c1;
    @RequestMapping("/currency")
    public Currency getCurrency(){
        return c1;
    }
}
