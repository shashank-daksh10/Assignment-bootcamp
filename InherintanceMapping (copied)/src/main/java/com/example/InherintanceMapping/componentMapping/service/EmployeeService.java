package com.example.InherintanceMapping.componentMapping.service;

import com.example.InherintanceMapping.componentMapping.entity.Employee;
import com.example.InherintanceMapping.componentMapping.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public void saveEmployee(Employee e){
        employeeRepo.save(e);
    }
    public List<Employee>retrieveData(){
        List<Employee>ans=new ArrayList<>();
        ans.addAll(employeeRepo.findAll());
        return ans;
    }

}
