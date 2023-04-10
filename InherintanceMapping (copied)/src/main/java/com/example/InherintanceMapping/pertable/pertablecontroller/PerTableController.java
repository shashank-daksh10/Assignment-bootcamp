package com.example.InherintanceMapping.pertable.pertablecontroller;

import com.example.InherintanceMapping.pertable.entity.CheckPerTable;
import com.example.InherintanceMapping.pertable.entity.CreditPerTable;
import com.example.InherintanceMapping.pertable.pertableservice.PerTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerTableController {
    @Autowired
    PerTableService perTableService;
     @PostMapping ("/pertable/cc")
    public String creditData(@RequestBody CreditPerTable cr){
         perTableService.addCredit1(cr);
         return "credit data addded";
     }
    @PostMapping ("/pertable/cd")
    public String creditData(@RequestBody CheckPerTable ch){
        perTableService.addCheck(ch);
        return "check data addded";
    }

    @GetMapping("/pertable/cc")
    public List<CreditPerTable> getCredit(){
         return perTableService.creditData();
    }
    @GetMapping("/pertable/cd")
    public List<CheckPerTable>getCheck(){
         return perTableService.checkData();
    }

}
