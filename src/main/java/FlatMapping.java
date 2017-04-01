import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Pawl on 3/22/2017.
 */
public class FlatMapping {

    public static void main(String... args) throws IOException {

        List<Person> persons = new ArrayList<>();
        String g= "sdssdsdsd ds ds";
        Files.write(Paths.get("C:\\Users\\Pawl\\Desktop\\java8\\2-java-8-whats-new-m2-exercise-files\\stream\\people2.txt"),g.getBytes());


     /*   try (
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        FlatMapping.class.getResourceAsStream("people.txt")));

                Stream<String> stream = reader.lines();
        ) {

            stream.map(line -> {
                String[] s = line.split(" ");
                Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
                persons.add(p);
                return p;
            })
                    .forEach(System.out::println);


        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        Optional<Person> opt =
                persons.stream().filter(p -> p.getAge() >= 20)
                        .min(Comparator.comparing(Person::getAge));
        System.out.println(opt);

        Optional<Person> opt2 =
                persons.stream().max(Comparator.comparing(Person::getAge));
        System.out.println(opt2);

        Map<Integer, String> map =
                persons.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getAge,
                                        Collectors.mapping(
                                                Person::getName,
                                                Collectors.joining(", ")
                                        )
                                )
                        );
        System.out.println(map);
  */  }
}