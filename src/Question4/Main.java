package Question4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.iterate(0,x->x<=50,x->x+5).
                forEach(System.out::println);

    }
}
