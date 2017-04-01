import java.time.*;

/**
 * Created by Pawl on 3/22/2017.
 */
public class TIME {
    public static void main(String...args){


        Instant ins = Instant.now();
        for(int i=0;i<(5*10*12545);i++){

        }
        Instant end = Instant.now();

        Duration elaplsed = Duration.between(ins,end);
        long sec = elaplsed.toMillis();
        System.out.println(sec);

        LocalDate date = LocalDate.of(1998, Month.AUGUST,23);
        LocalDate date2 = LocalDate.now();

        Period duration = date.until(date2);
        long s = duration.getYears();
        System.out.println(s);


    }
}
