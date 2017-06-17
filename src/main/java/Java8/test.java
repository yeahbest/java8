package Java8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Pawl on 3/23/2017.
 */
public class test {
 public static void main(String...args)throws Exception{

     Path file = Paths.get("C:\\Users\\Krzysiek\\Desktop\\java8\\src\\main\\java\\Java8\\people.txt");
     BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
     SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
     System.out.println("After Format : " + sdf.format(attrs.lastModifiedTime()));
 }
 }

