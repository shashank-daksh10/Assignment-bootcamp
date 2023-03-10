package Question1;
interface Consumers{
    public void operation(int a,int b);
}
public class Consumer {
    public static void main(String[] args) {


        Consumers c1 = (int a, int b) -> {
            System.out.println(a + b);
        };
        c1.operation(66,77);
    }
}
