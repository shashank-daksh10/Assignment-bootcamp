package Question5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String FullName ,Firstname,Middlename,Lastname;
    Long Salary;
    String City;
    public Employee(){

    }
    public Employee(String firstname,String middlename,String lastname,Long salary, String city) {
        FullName = firstname+" "+middlename+" "+lastname;
        Firstname=firstname;
        Middlename=middlename;
        Lastname=lastname;
        Salary = salary;
        City = city;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(new Employee("Shashank","","daksh",2000L,"Delhi"));
        employeeList.add(new Employee("raj","","malhotra",9000L,"Delhi"));
        employeeList.add(new Employee("rahul","","pradhan",2500L,"Delhi"));
        employeeList.add(new Employee("raj","","kaushal",2000L,"Noida"));
        employeeList.add(new Employee("Shubham","","sharma",2000L,"Delhi"));
        employeeList.add(new Employee("Shubham","","kumar",4000L,"Delhi"));
        employeeList.add(new Employee("Dinesh","","kadian",6000L,"delhi"));
        employeeList.add(new Employee("ankit","","sharma",9000L,"kashmir"));
        employeeList.add(new Employee("ankit","","pal",3000L,"Delhi"));

        HashSet<String>set=new HashSet<>();
        employeeList.stream()
                .filter(e->e.Salary<5000)
                .filter(e->e.City.equalsIgnoreCase("delhi"))
                .forEach(e-> set.add(e.Firstname));
        set.forEach(System.out::println);







    }
}
