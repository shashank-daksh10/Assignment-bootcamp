package com.example.Restapi1.Question2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeFill {
    List<Employee> l1=new ArrayList<>();

    public List<Employee>getdetail(){
//        l1.add(new Employee(1,"Shashank",21));
//        l1.add(new Employee(2,"Daksh",20));
//        l1.add(new Employee(3,"Abhinav",22));
//        l1.add(new Employee(4,"Pulkit",23));

        return l1;
    }
    public Employee getSpecific(int id){
        Employee ans = new Employee();
        ans= l1.stream().filter(e->e.id==id).findAny().get();

       return ans;
    }

    public Employee addDetail(Employee e){
        l1.add(e);
        return e;
    }

    public String deleteDetail(int id){
        l1.removeIf(p->p.id==id);
        return "Deleted the id details";
    }

    public Employee getException(int id){
        Employee s1= l1.stream().filter(e->e.id==id).findFirst().orElse(null);
        return s1;
    }

    public void updateEmployee(Employee employee){
        int index=-1;
        for(Employee e:l1){
            if(e.getId()==employee.getId()){
                index=l1.indexOf(e);
                break;
            }
        }
        l1.set(index,employee);
    }

}