package Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum {
    public static void main(String[] args) {

        List<Integer>number= Arrays.asList(2,3,5,1,11,22,8,7,65,90,4);

        System.out.println(number.stream().filter(s->s>5).reduce(0,(e1,e2)->e1+e2));
        List<Integer> collect = number.stream().filter(s -> s > 5).collect(Collectors.toList());
    }
}
