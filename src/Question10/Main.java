package Question10;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String motto="DO CODING EVERYDAY FOR 1 HOUR FOR SELF DEVELPOMENT \n";
        System.out.println(motto.repeat(3));


        String str="   lets do something new     ";
        System.out.println(str.trim());
        System.out.println(str.strip());  // no difference noticed.

        String str2= "    ";
        System.out.println(str.isBlank());
        System.out.println(str2.isBlank());



        String str3 ="    lets check indent function with method";
        System.out.println(str3.indent(-13));//remove leading spaces
        System.out.println(str3.indent(18));// add leading spaces


        String str4= "SHASHANK  DAKSH  ABHINAV  SHARMA  PULKIT  NARAINE";
        List<String>l1=str4.transform(s-> Arrays.asList(s.split("  ")));


        System.out.println(l1);


        String str5= "  hello everyone   i am    doing coding   everyday   at ttn    ";//remove extra white space
        System.out.println(str5.stripIndent());
         int d=12;
         String name="daksh";
       // String str6="\ "Hello \\nWorld\ "";  translateEscape() ??




        System.out.println(String.format("Hello %d %s",d,name));// see the format.


    }
}
