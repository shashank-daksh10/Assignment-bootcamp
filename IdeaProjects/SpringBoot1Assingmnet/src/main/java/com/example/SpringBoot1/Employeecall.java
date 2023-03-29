package com.example.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Employeecall{

List<Employee>l1=new ArrayList<>();
    @Autowired
    EmployeeDao ed;

    @GetMapping("/employee")
    public List<Employee>getEmployee(){


       return l1;
    }
    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee e1){
        ed.findAll().forEach(l1::add);
        ed.save(e1);

//        return ed.postDetail(e1);
    }

}