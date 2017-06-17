package JavaCollections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Pawl on 4/4/2017.
 */
public class Dateformatter {

    public static void main(String... args) {

        LocalDateTime date = LocalDateTime.now();
        LocalTime time = LocalTime.now();
//        System.out.println(date);
//        System.out.println(time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = date.format(formatter);

        System.out.println("After : " + formatDateTime);

    }
}
