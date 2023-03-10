package Question3;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1,75).forEach(System.out::println);// 1 included , 75 not included


        System.out.println("using range closed now");

        System.out.println();
        IntStream.rangeClosed(1,15).forEach(System.out::println);//both 1,15 included.
    }
}
