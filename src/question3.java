
public class question3{
     public static void main(String[]args){
         try{
             DakshClass di=new DakshClass();
             Class.forName("d"); // class not found expection;
         }catch(ClassNotFoundException e){
             System.out.println(e);
             e.printStackTrace();
         }
         DakshClass d2= new DakshClass();//no classdef found error
     }
}