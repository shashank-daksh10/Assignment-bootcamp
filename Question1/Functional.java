package Question1;
interface consume{
    public void operation(int a,int b);
}
public class Functional {
    public static void main(String[] args) {
        consume c1=(int a,int b)->{
            System.out.println(a+b);
        };
        c1.operation(9,66);
    }
}
