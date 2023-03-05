package question2;
import java.util.*;


public class Employee{
     Double age;
     Double salary;

     String firstname;

     String lastname;

    public Employee(Double age ,Double salary,String fisrtname,String lastname){
         this.age=age;
         this.salary=salary;
         this.firstname=fisrtname;
         this.lastname=lastname;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
class sortbyname implements Comparator<Employee>{
    public int compare(Employee a,Employee b){
      if(a.firstname.compareTo(b.firstname)==0){
          return a.lastname.compareTo(b.lastname);
      }
      return a.firstname.compareTo(b.lastname);
    }
}
