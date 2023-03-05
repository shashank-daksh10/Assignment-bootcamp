package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String []args){
        List<Employee> l1=new ArrayList<>();
        l1.add(new Employee(34.3,20100.5,"shashank","daksh"));
        l1.add(new Employee(23.6,20100.5,"abhinav","sharma"));
        l1.add(new Employee(34.3,20100.7,"wahid","khan"));
        l1.add(new Employee(33.6,20000.8,"abhinav","daksh"));
        l1.add(new Employee(33.8,9000.9,"abhilash","dhawan"));
        Collections.sort(l1,new sortbyname());
//        Collections.sort(l1,(a,b)->a.firstname.charAt(0)==b.firstname.charAt(0)?a.lastname.charAt(0)-
//                b.lastname.charAt(0):a.firstname.charAt(0)-b.firstname.charAt(0));

        System.out.println(l1);

    }
}
