package com.example.jpa2Assignment.service;

import com.example.jpa2Assignment.Entity.Employee;
import com.example.jpa2Assignment.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee>getEmployee(){
        List<Employee>ex=new ArrayList<>();
        employeeRepo.findAll().forEach(ex::add);
        return ex;
    }
    public String addEmployee(Employee e){
        employeeRepo.save(e);
        return "Employee added";
    }
    public String deleteValue(int id){
        employeeRepo.deleteById(id);
        return "item deleted matching to that id";
    }
    public List<Object[]>getFilter(){
        List<Object[]> val=employeeRepo.findDefined();
        return val;
    }

    public void updateSalary(int salary){
        Long avgSalary= employeeRepo.avgSalary();
        employeeRepo.updateEmployeesBySalary(salary,avgSalary);
    }

    public void deleteMinimum(){
        Long minSalary=employeeRepo.minSalary();
        employeeRepo.deleteEmployeeWithMinSalary(minSalary);
    }

    public List<Object[]>getList(String name){
        List<Object[]>ans=employeeRepo.getEmployeesWithSingh(name);
        return ans;
    }

    public void  deleteEmployeeDataByAge(int age){
        employeeRepo.deleteEmployeesByAge(age);
    }

}
