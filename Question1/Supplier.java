package Question1;
interface supply{
    int operation();
}
public class Supplier {
    public static void main(String[] args) {
        supply s1=()->{
            return 20;
        };
        System.out.println(s1.operation());
    }
}
