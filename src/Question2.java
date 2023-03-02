import java.util.Scanner;


public class Question2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number to be divided: ");
            int n1 = scanner.nextInt();
            System.out.print("Enter divisor: ");
            int n2 = scanner.nextInt();
            int result = n1 / n2;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error occur: " + e.getMessage());//for divided by 0
        } catch (Exception e) {
            System.out.println("unknown value feeded: " + e.getMessage());// for unknown value
        } finally {
            scanner.close();
            System.out.println("CalCulation Done .");
        }
    }
}