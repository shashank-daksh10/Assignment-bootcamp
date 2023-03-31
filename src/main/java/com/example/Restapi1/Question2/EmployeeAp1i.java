package com.example.Restapi1.Question2;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeAp1i {
    @Autowired
    EmployeeFill ef;
    @GetMapping("/Employee")
    public List<Employee>getEmployeeDetail(){
        return ef.getdetail();
    }
    @GetMapping("/Employee/{id}")
    public Employee getDetails(@PathVariable int id){
        Employee e1=ef.getException(id);
        if(e1==null){
            throw new EmployeeException("id not found ***************"+id);

        }
        return e1;

    }
//    @GetMapping("/Employee/{id}")
//    public Employee getparticular(@PathVariable int id){
//          Employee e1=ef.getException(id);
//        if(e1==null){
//            throw new EmployeeException("name ***************"+id);
//
//        }
//        return e1;
//    }
    @PostMapping("/Employee")
    public Employee postdetetail(@Valid @RequestBody Employee e){
        ef.addDetail(e);
        return  e;
    }

    @DeleteMapping("/Employee/{id}")
    public String delete(@PathVariable int id){
        return ef.deleteDetail(id);
    }

    @PutMapping("/Employee")
    public void updateEmployee(@RequestBody Employee employee){
        ef.updateEmployee(employee);
    }
}
