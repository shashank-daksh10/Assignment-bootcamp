import java.util.Scanner;
public class question2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=" ";
        while(true){
            System.out.println("Enter text");
            String line = sc.nextLine();
            if(line.equals("XDONE"))break;

            input+=line + "\n";
        }
        System.out.println("enetered text");
        System.out.println(input);
    }
}