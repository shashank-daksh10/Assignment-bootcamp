package Question2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>li= Arrays.asList("Shashank","Daksh","pulkit","Naraine","Shubhank","savi","Ashok"
        ,"Shikhar","Abhinav");
        System.out.println();
        System.out.println("for takewhile");
        li.stream().takeWhile(e->e.length()>4).forEach(System.out::println);
        System.out.println();
        System.out.println("for dropwhile");
        li.stream().dropWhile(s->s.length()>4).forEach(e-> System.out.println(e));
    }
}
