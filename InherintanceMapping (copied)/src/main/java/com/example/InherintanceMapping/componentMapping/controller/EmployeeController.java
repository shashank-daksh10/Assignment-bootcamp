package com.example.InherintanceMapping.componentMapping.controller;

import com.example.InherintanceMapping.componentMapping.entity.Employee;
import com.example.InherintanceMapping.componentMapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/component")
    public String addData(@RequestBody Employee e){
        employeeService.saveEmployee(e);
        return "employee added";

    }
    @GetMapping("/component")
    public List<Employee> getEmployeeData(){
        return employeeService.retrieveData();
    }
}
