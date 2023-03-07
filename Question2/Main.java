package Question2;
interface test{

    public void show();

    default void showing(){
        System.out.println("default calling");
    }

    static void shows(){
        System.out.println("static showing");
    }
}
public class Main {
    public static void main(String[] args) {
    test sb = new test(){
          public void show(){
                System.out.println("interface called");
            }
        };
    sb.show();
    sb.showing();
    test.shows();
    }
}
