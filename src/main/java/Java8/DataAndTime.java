package Java8;
import java.time.*;

/**
 * Created by Pawl on 3/26/2017.
 */
public class DataAndTime {
    public static void main(String[] args) {

    LocalDate now = LocalDate.now();

ZonedDateTime current =    ZonedDateTime.of(now,LocalTime.of(22,50),ZoneId.of("Europe/London")
    );


    ZonedDateTime nextMeeting = current.plusMonths(1);
    ZonedDateTime nextMeetingUS = nextMeeting.withZoneSameInstant(ZoneId.of("US/Central"));

        System.out.println(Instant.now());
    }


}
