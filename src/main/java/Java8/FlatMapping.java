package Java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.sun.org.apache.xerces.internal.utils.SecuritySupport.getResourceAsStream;

/**
 * Created by Pawl on 3/22/2017.
 */
public class FlatMapping {

    public void main(String... args) throws IOException {


        List<Person> persons = new ArrayList<>();

        try (
                BufferedReader reader =
                        new BufferedReader( new InputStreamReader(
                                        this.getClass().getResourceAsStream("C:\\Users\\Pawl\\IdeaProjects\\Java8\\src\\main\\java\\Java8\\people.txt")));

        ) {


        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}