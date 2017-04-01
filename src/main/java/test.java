import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

/**
 * Created by Pawl on 3/23/2017.
 */
public class test {
    public static void main(String... args)  {

        try (
                BufferedReader reader =
                        new BufferedReader
                                (new InputStreamReader
                                (test.class.getResourceAsStream("people.txt")))

                ;)
        {
            Stream<String> stream =reader.lines();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
