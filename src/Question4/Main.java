package Question4;

public class Main{
    public static void main(String[]args){
        try{
            throw new myException("Dummy Exception occurred");
        }catch(myException e){
            System.out.println(e.getMessage());
        }
    }
}