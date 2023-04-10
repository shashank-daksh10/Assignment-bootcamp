package com.example.InherintanceMapping.joined.joinedcontroller;

import com.example.InherintanceMapping.joined.entity.CheckJoined;
import com.example.InherintanceMapping.joined.entity.CreditJoined;
import com.example.InherintanceMapping.joined.entity.PaymentJoined;
import com.example.InherintanceMapping.joined.service.JoinedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JoinedController {
    @Autowired
    JoinedService joinedService;

    @PostMapping("/joined/cc")
    public String creditData(@RequestBody CreditJoined cr){
        joinedService.addCredit(cr);
        return "credit data addded";
    }
    @PostMapping ("/joined/cd")
    public String creditData(@RequestBody CheckJoined ch){
        joinedService.addCheck(ch);
        return "check data addded";
    }

    @GetMapping("/joined/cc")
    public List<CreditJoined> getCredit(){
        return joinedService.creditData();
    }
    @GetMapping("/joined/cd")
    public List<CheckJoined>getCheck(){
        return joinedService.checkData();
    }

    @GetMapping("/joined/main")
    public List<PaymentJoined>getPaymnet(){
        return joinedService.paymentData();
    }

}
