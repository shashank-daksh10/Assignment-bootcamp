package Question1;

import java.util.function.Function;

public class function {
    public static void main(String[] args) {
        Function<Integer ,Double > fn = x->x*2.0;
        System.out.println(fn.apply(3));
        fn=fn.andThen(a->a*10.0);
        System.out.println(fn.apply(4));
    }
}
