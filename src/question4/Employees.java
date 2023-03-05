
package question4;
import java.util.*;

 public class Employees{
    String name;
    int age;
    String designation;

    public Employees(String name ,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

     @Override
     public String toString() {
         return "Employees{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", designation='" + designation + '\'' +
                 '}';
     }
 }
