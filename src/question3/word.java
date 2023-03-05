package question3;

import java.io.*;
import java.util.*;

public class word {

    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
           File file = new File("/home/shashank/word.txt");
        try(FileWriter fr = new FileWriter(file, true)){
            while(true) {
                System.out.println("Enter the line u want to add in the file");
                String line = sc.nextLine();

                fr.write(line+"\n");


                System.out.println("do you want to enter more text,if no then write QUIT else click " +
                        "enter");
                String input =sc.nextLine();
                if(input.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // finding the word count now.

        System.out.println("Enter the word u want to search");
        String s1;
        int count =0;
        //List<String> content=new ArrayList<>();

        String letter = sc.nextLine();

       try(FileReader fr1= new FileReader(file)) {

           BufferedReader br = new BufferedReader(fr1);


           while((s1=br.readLine())!=null){
               String[]content=s1.split(" ");
             // content.add(Arrays.toString(s1.split(" ")));
              //content.add("\n");
               for (String s: content){
                   if(s.equalsIgnoreCase(letter))
                       count++;
               }
           }

           fr1.close();

       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
       if(count==0){
           System.out.println("this letter is not present in the file");
       }
       else
           System.out.println("letter present for "+ count+" times");


    }
}
