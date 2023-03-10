package Question6;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class CurrentTime{
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();


        System.out.println("Current date and time in the system default time zone: " + now);


        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;




        ZoneId newYorkZoneId = ZoneId.of("Asia/Kolkata");
        LocalDateTime kolkata = LocalDateTime.now(newYorkZoneId);
        System.out.println("Current date and time in kolkata: " + formatter.format(kolkata));

        ZoneId londonZoneId = ZoneId.of("Europe/London");
        LocalDateTime londonTime = LocalDateTime.now(londonZoneId);
        System.out.println("Current date and time in London: " + formatter.format(londonTime));

        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        LocalDateTime tokyoTime = LocalDateTime.now(tokyoZoneId);
        System.out.println("Current date and time in Tokyo: " + formatter.format(tokyoTime));
    }
}