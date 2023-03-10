package Question1;

interface PrivateInterface{
    public void normal();

    default void DefaultMethod(){
        PrivateMethod();
        PrivateStatic();
        System.out.println("Default method called");
    }
    static void StaticMethod(){
        PrivateStatic();
        PrivateStatic();
        System.out.println("Static Method called");
    }
    private void PrivateMethod(){
        System.out.println("Private called");
    }
    private static void PrivateStatic(){
        System.out.println("Private Static Called");
    }
}
 class Calling implements PrivateInterface{
    public void normal(){
        System.out.println("Normal Called");
    }
 }
public class Main {
    public static void main(String[] args) {
        Calling cl=new Calling();
        cl.normal();
        cl.DefaultMethod();
        PrivateInterface.StaticMethod();
    }
}
// private Method can have body but should be placed(instance) inside the default ot static method.
// we cannot call private/priavte static method directly from object or interface.