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
class Execute implements test{
    public void show(){
        System.out.println("called via extend class");
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

        System.out.println("Calling via extend class now");

    Execute e1=new Execute();
    e1.show();
    e1.showing();
    test.shows();
    }
}
