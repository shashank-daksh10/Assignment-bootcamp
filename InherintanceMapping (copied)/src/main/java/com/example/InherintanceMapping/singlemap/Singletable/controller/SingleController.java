package com.example.InherintanceMapping.singlemap.Singletable.controller;

import com.example.InherintanceMapping.singlemap.Singletable.entity.Check;
import com.example.InherintanceMapping.singlemap.Singletable.entity.Credit;
import com.example.InherintanceMapping.singlemap.Singletable.entity.Payment;
import com.example.InherintanceMapping.singlemap.Singletable.service.SingleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SingleController {
    @Autowired
    SingleService singleService;

    @PostMapping("/path/cc")
    public String addCreditCard(@RequestBody Credit cr){
        singleService.addCredit(cr);
        return "credit card added";
    }

    @PostMapping("/path/ch")
    public String addCheckNo(@RequestBody Check cr){
        singleService.addCheck(cr);
        return "check added";
    }

    @GetMapping("/path")
    public List<Payment>retrievePayment(){
        return singleService.getData();
    }
}
