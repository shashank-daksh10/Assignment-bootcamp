package com.jpa1.JpaTodoAssingment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao ed;


    public String SaveData(Employee e){
        ed.save(e);
        return "data added to database";
    }

    public String UpdateData(Employee e,int id){
       Employee ex = ed.findById(id).orElse(null);
       if(ex==null){
           throw new RuntimeException();
       }
        ex.setName(e.getName());
        ex.setAge(e.getAge());
        ed.save(ex);

        return "value updated";

    }

    public String DeleteValue(int id){
        ed.deleteById(id);
        return "item deleted matching to that id";
    }
    public List<Employee>GetData(){
        List<Employee> employeeList = new ArrayList<>();
        ed.findAll().forEach(employeeList::add);
        return employeeList;
    }
    public long GetCount(){
        long ans=ed.count();
        return ans;

    }
    public List<Employee>RetrieveName(String name){
        Pageable p1= PageRequest.of(0,1, Sort.Direction.DESC,"name");
//        Sort s1 =  Sort.by(Sort.Direction.DESC,"age");
        List<Employee>ex=ed.findByName(name,p1);
        return ex;
    }
    public List<Employee> RetrieveNameStartsWith(String name){
        Pageable p1= PageRequest.of(0,1, Sort.Direction.DESC,"name");
        List<Employee>ex=ed.findByNameStartingWith(name,p1);
        return ex;
    }
    public List<Employee> RetrieveAgeIsBetween(int max,int min){
        List<Employee>ex=ed.findByAgeIsBetween(max,min);
        return ex;
    }
}
