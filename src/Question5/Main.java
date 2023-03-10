package Question5;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>li=Arrays.asList("shashank","daksh","shubhank","sharma","pulkit","naraine");

        li.stream().filter(e->e.contains("z")).findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> System.out.println("no string present"));

        li.stream().filter(e->e.contains("t")).findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> System.out.println("no string present"));
    }
}
