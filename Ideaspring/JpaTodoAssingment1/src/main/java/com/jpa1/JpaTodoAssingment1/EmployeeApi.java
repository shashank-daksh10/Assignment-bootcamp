package com.jpa1.JpaTodoAssingment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeApi {
    @Autowired
    private EmployeeService emp;

    @PostMapping("/employee")
    public String Add(@RequestBody Employee e){
       return emp.SaveData(e);

    }
    @PutMapping("/employee/{id}")
    public String Update(@PathVariable int id ,@RequestBody Employee e){
      return emp.UpdateData(e,id);

    }
    @DeleteMapping("/employee/id")
    public String Delete(@PathVariable int id){
        return emp.DeleteValue(id);
    }
    @GetMapping("/employee")
    public List<Employee>RetrieveEmployee(){
       return emp.GetData();
    }
    @GetMapping("/employee/count")
    public long RetrieveCount(){
        return emp.GetCount();

    }
    @GetMapping("/employee/{name}")
    public List<Employee>FindingName(@PathVariable String name){
        return emp.RetrieveName(name);
    }
    @GetMapping("/employees/{name}")
    public List<Employee> FindingNameStarts(@PathVariable String name){
        return emp.RetrieveNameStartsWith(name);
    }


    // way to take 2 pathVariable
    @GetMapping("/employees/range/{min}/{max}")
    public List<Employee> FindBetweenAge(@PathVariable int min,@PathVariable int max){

        return emp.RetrieveAgeIsBetween(min,max);
    }
//    @GetMapping("/employess/specific")
//    public List<Employee>findSpecifDetail(@PathVariable){
//        emp.
//    }
}
