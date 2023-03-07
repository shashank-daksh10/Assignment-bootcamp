package Question3;
interface inter1 {
default void display(){
        System.out.println("inter1 called");
        }
}
interface child1 extends inter1{
    default void display(){
        inter1.super.display();
        System.out.println("child1 called");
    }
}
interface child2 extends inter1{
    default void display(){
        System.out.println("child2 called");
    }
}
 class DefaultMethods implements child1,child2 {
     public void display() {
         child1.super.display();
         child2.super.display();
         System.out.println("DefaultMethods called" );

     }

 }


public class Main {
    public static void main(String[] args) {
        DefaultMethods d =new DefaultMethods();
        d.display();


    }
}

