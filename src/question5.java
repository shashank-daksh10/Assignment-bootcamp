
//question 5
import java.util.*;
public class question5{
    private String firstname,lastname,designation;
    private int age;
    public question5(){

    }
    public question5(String firstname,String lastname,String designation,int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.designation=designation;
        this.age=age;
    }

    //getter
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getDesignation(){
        return designation;
    }
    public int getAge(){
        return age;
    }
    // setter
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        return firstname +" "+ lastname + " " + designation + " "+ age ;
    }

    public static void main(String[] args) {
        question5 emp1=new question5("Shashank", "daksh","JVM TRAINEE",21);
        System.out.println("FisrtName :" +emp1.getFirstname());
        System.out.println("lastName :" +emp1.getLastname());
        System.out.println("Designation :" +emp1.getDesignation());
        System.out.println("age:" +emp1.getAge());

        question5 emp2= new question5();
        emp2.setFirstname("Pulkit");
        emp2.setLastname("Naraine");
        emp2.setDesignation("SDE");
        emp2.setAge(21);

        System.out.println("FirstName :"+ emp2.getFirstname());
        System.out.println("lastname :"+ emp2.getLastname());
        System.out.println("designation:"+ emp2.getDesignation());
        System.out.println("age :"+ emp2.getAge());

        System.out.println(emp1);

    }
}