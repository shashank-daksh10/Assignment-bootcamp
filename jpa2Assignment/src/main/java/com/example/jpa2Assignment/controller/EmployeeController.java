package com.example.jpa2Assignment.controller;

import com.example.jpa2Assignment.Entity.Employee;
import com.example.jpa2Assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee>getEmployee(){
        return employeeService.getEmployee();
    }
    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee e){
       return  employeeService.addEmployee(e);
    }
    @DeleteMapping("/employee/{id}")
    public String Delete(@PathVariable int id){
        return employeeService.deleteValue(id);
    }

    @GetMapping("/employee/filter")
    public List<Object[]>getEmployeeFilter(){
        return employeeService.getFilter();
    }

    @PutMapping("/employee/{salary}")
    public String updatedSalary(@PathVariable int salary){
        employeeService.updateSalary(salary);
        return "Value updated for the required Employees";

    }
    @DeleteMapping("/employee/minsalary")
        public String deleteMinSalary() {
            employeeService.deleteMinimum();
            return "min salary person deleted";
    }
    @GetMapping("/employee/display/{name}")
    public List<Object[]>getByLastName(@PathVariable String name){
        List<Object[]>ans=employeeService.getList(name);
        return ans;
    }
    @DeleteMapping("/employee/data/{age}")
    public String deletebyAge(@PathVariable int age){
        employeeService.deleteEmployeeDataByAge(age);
        return "employee deleted";
    }


}
