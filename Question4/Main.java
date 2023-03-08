package Question4;

import java.util.Optional;


public class Main {
    public static void main(String[] args){
       String fullname=addname("Shashank","Daksh");
       Optional<String>s1=Optional.ofNullable(fullname);
        System.out.println(s1.get());
        String fullname2=addname2(null,null);
        Optional<String>s2=Optional.ofNullable(fullname2);
        System.out.println(s2.orElse("no string"));

    }
   public static String addname(String s1,String s2){
        return s1.concat(" ").concat(s2);
   }

   // written to check the orElse method of optional class
    // above static method is giving null pointer exception
   public static String addname2(String s1,String s2){
        if(s1==null || s2==null){
            return null;
        }
        return s1.concat(s2);
   }
}
