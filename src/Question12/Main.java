package Question12;
sealed class home1 permits home2,home3{
    public void show(){
        System.out.println("home 1 called");
    }
}
final class home2 extends home1{
     public void show(){

         System.out.println("home 2 called");

     }
}
non-sealed class home3 extends home1{
    public void show() {

        System.out.println("home 3 called");

    }
}
class home4 extends home3{
    public void show(){
        System.out.println("home 4 called");

    }
}

public class Main {
    public static void main(String[] args) {
        home1 h1=new home1();
        home2 h2=new home2();
        home3 h3=new home3();
        home4 h4 =new home4();

        h1.show();
        h2.show();
        h3.show();
        h4.show();
    }

}
// sealed class can be extended nly by permitted class
// non sealed class are normal class
// final class  only extended to class which permit them.
// difference between non sealed and normal class?
// super method?