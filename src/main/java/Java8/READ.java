package Java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Krzysiek on 2017-04-09.
 */
public class READ {
    public static  void rr(){
    String line;
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Pawl\\IdeaProjects\\Java8\\src\\main\\java"))){
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
    }catch (IOException e){
        e.printStackTrace();
    }
}
public static  void main(String...args) throws IOException {
    redAll();
}
    public static void redAll()throws IOException{
        List<String> listOfShit=Files.readAllLines(Paths.get("C:\\Users\\Krzysiek\\Desktop\\testy.docx"));
        listOfShit.stream().forEach(System.out::println);
    }
}
