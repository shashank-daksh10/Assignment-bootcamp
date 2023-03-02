
import java.util.*;
public class question3 {
    public static void main(String[] args) {
        System.out.println("*******Menu*******");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        System.out.print("Choose an option (1-3): ");

        Scanner scanner = new Scanner(System.in);
        int option =scanner.nextInt();
        if (option == 1) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = 3.14 * radius * radius;
            System.out.println("The area of the circle is: " + area);
        } else if (option == 2) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double circumference = 2 * Math.PI * radius;
            System.out.println("The circumference of the circle is: " + circumference);
        } else if (option == 3) {
            System.out.println("Exit the program...");
        } else {
            System.out.println("Invalid option. Please choose between 1-3.");
        }
    }
}