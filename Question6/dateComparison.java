
package Question6;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class dateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateString = scanner.nextLine();

        //ISO LOCAL DATE = DEFAULT FOR YEAR-MONTH-DATE
        LocalDate firstDate = LocalDate.parse(firstDateString, DateTimeFormatter.ISO_LOCAL_DATE) ;


        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateString = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateString, DateTimeFormatter.ISO_LOCAL_DATE);


        if (firstDate.isBefore(secondDate)) {
            System.out.println(firstDateString + " occurs before " + secondDateString);
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println(firstDateString + " occurs after " + secondDateString);
        } else {
            System.out.println(firstDateString + " and " + secondDateString + " are the same date");
        }
    }
}