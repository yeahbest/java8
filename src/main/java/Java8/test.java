package Java8;

import java.io.*;
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
                                (test.class.getResourceAsStream("Java8/people.txt")))

                ;)
        {
            Stream<String> stream =reader.lines();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
