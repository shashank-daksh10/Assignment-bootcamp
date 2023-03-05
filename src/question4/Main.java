package question4;

import java.util.HashMap;
import java.util.Map;

class  Main {
    public static void main(String[] args) {
         Employees e1=new Employees("Shashank",21,"trainee");
        Employees e2=new Employees("pulkit",21,"QE");
        Employees e3=new Employees("Samrat",23,"devops");
        Employees e4=new Employees("raj",22,"sde");

        Map<Employees,Integer> map=new HashMap<>();
        map.put(e1,15000);
        map.put(e2,250000);
        map.put(e3,75000);
        map.put(e4,100000);

        System.out.println(map.get(e1));

    }
}