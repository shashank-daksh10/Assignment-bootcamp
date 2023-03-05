package Question2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
class User {
    private String firstname;
    private String lastname;
    private int age;
    private String phonenumber;


    public User(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User" +  " {" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}




public class User_creator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try(FileWriter fileWriter = new FileWriter("/home/shashank/users.txt",true)){
            while (true) {
                System.out.print("Enter the user's first name: ");
                String firstname = scanner.nextLine();

                System.out.print("Enter the user's last name: ");
                String lastname = scanner.nextLine();

                System.out.print("Enter the user's age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the user's phone number: ");
                String phonenumber = scanner.nextLine();
                User user = new User(firstname,lastname,age,phonenumber);

                fileWriter.write(user+"\n");





                // use if u want to see content also
                // after writing in file;
//                int i;
//              FileReader fr = new FileReader("/home/shashank/users.txt");
//                while ((i = fr.read()) != -1)
//                    System.out.print((char)i);



                System.out.print("Do you want to continue creating users? (Type QUIT to exit):(Press Enter to add more) ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }



}