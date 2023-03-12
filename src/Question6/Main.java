package Question6;

import javax.management.InstanceNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer>li=Arrays.asList(1,2,3,4,5,6,7 ,9,8);

        li.stream()
                .filter(e->e>8).findFirst()
                .stream()
                .mapMulti((n,c)->IntStream.rangeClosed(1,10)
                .forEach(e->c.accept(e*n)))
                .forEach(System.out::println);
    }
}
