package Question5;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception{

        //incomplete and wrong


        List<String>li=Arrays.asList("shashank","daksh","shubhank","sharma","pulkit","naraine");

        li.stream().filter(e->e.contains("s")).findFirst()
                        .or(()-> Optional.of(null))
                                .ifPresent(System.out::println);
        li.stream().filter(e->e.contains("t")).findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> System.out.println("no string present"));
        li.stream()
                .filter(e->e.contains("z")).findFirst()
                .orElseThrow(()->new Exception("No word like this in your data"));
    }
}
