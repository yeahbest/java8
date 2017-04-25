package Java8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.stream.Stream;

/**
 * Created by Pawl on 3/23/2017.
 */
public class test {
    public static void main(String... args)  {

        /**
         * write
         */
//        Properties probs = new Properties();
//        probs.setProperty("hehe", "gowno");
//        probs.setProperty("hsehe", "gasowno");
//        probs.setProperty("zzhehe", "gossswno");
//
//        try(Writer writer= Files.newBufferedWriter(Paths.get("xyz.properties")) ){
//            probs.store(writer, "sdsds");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        //Load

        Properties probs = new Properties();
        try (Reader reader=Files.newBufferedReader(Paths.get("xyz.properties"))){
            probs.load(reader);

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(probs.get("hehe"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
    }
}
