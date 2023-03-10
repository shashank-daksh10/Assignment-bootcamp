package Question9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,3,22,4,5,45,324,24,45);

        List<Integer>copy=List.copyOf(l1);
        //copy.add(9);    this line will give runtime error
        System.out.println(copy);

    }
}
