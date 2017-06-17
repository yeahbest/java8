package Java8_AdvancedStuff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by Krzysiek on 2017-04-09.
 */
public class SpliteratorCreation {
    public static void main (String...args) {

        Path path = Paths.get("C:\\Users\\Krzysiek\\Desktop\\java8\\src\\main\\java\\Java8_AdvancedStuff\\people.txt");
        try (Stream<String> lines = Files.lines(path)) {

            Spliterator<String> spliterator01 = lines.spliterator();
            Spliterator<Person> spliterator2= new personSpliterator(spliterator01);

            Stream<Person> people= StreamSupport.stream(spliterator2,false);
            people.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
