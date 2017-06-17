package different;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by Krzysiek on 2017-06-16.
 */
public class readfiles {

    public static void main(String... args) throws Exception {

        {
            Path file = Paths.get("C:\\Users\\Krzysiek\\Desktop\\java8\\src\\main\\java\\Java8\\people.txt");
            Files.isHidden(file);
            Files.delete(file);
            try (Stream<Path> path = Files.walk(file)) {
                path.sorted(Comparator.reverseOrder()).filter(s -> s.endsWith("txt")).map(Path::toFile).forEach(File::delete);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

