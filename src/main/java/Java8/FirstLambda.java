package Java8;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Pawl on 3/21/2017.
 */
public class FirstLambda {

    public static void Filters(String... args) {
        FileFilter filter = (file) -> file.getName().endsWith(".java");

        try(Stream<Path> e = Files.walk(Paths.get("C:\\Users\\Pawl\\IdeaProjects\\Java8\\src\\main\\java"))){
            e.forEach(list->{

                    System.out.println(list);
                }
            );

        }catch (IOException e){
            e.printStackTrace();
        }
        File dir = new File("C:\\Users\\Pawl\\Desktop\\coreplatform");
        File[] files = dir.listFiles(filter);
        for (File f : files) {
            System.out.println(f);
        }
    }

    public void Thread(String... args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello world Thread [" + Thread.currentThread().getName() +
                        "]");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
    }

    public void S(String... args) {
        Comparator<String> compare = (s1, s2) ->
                Integer.compare(s1.length(), s2.length());

        List<String> list = Arrays.asList("****", "*", "*****", "**", "***");
        Collections.sort(list, compare);
        for(String l: list){
            System.out.println(l);
        }
    }

//    public void xmain(String... args){
//        List <String> strings =Arrays.asList("one","two","three","four");
//        List< String>result = new ArrayList<>();
//       Consumer<String> c1 =System.out::println;
//       Consumer<String> c2 = result::add;
//
//        strings.forEach(c1);
//        strings.forEach(c1.andThen(c2));
//    }

//    public static  void   main(String... args) {
//    Stream<String>stream=Stream.of("one","two","three","four","five");
//        List<String>ok = new ArrayList<>();
//        List <String> strings =Arrays.asList("one","two","three","four");
//        Predicate<String>p1=s->s.length()>3;
//        strings.stream().filter(s ->
//        s.contains("four")).forEach(ok::add);
// //       stream.filter(p1).forEach(System.out::println);
//
//        Predicate<String>p2 = Predicate.isEqual("two");
//        stream
//                .filter(p2)
//                .forEach(ok::add);
//
//        ok.forEach(System.out::println);
//
//        System.out.println("sieze of the result "+ok.size());
//    }
public void smain(String... args) {
    Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
    Predicate<String>s1= Predicate.isEqual("two");
    Predicate<String>s2= Predicate.isEqual("one");
    List<String>ok = new ArrayList<>();
    stream
            .peek(System.out::println)
            .filter(s1.or(s2))
            .forEach(ok::add);
}
    public void mdain(String... args){

        List<Integer>list1=Arrays.asList(1,2,3,4,5,6,7);
        List<Integer>list2=Arrays.asList(2,4,6);
        List<Integer>list3=Arrays.asList(5,3,7);

        List<List<Integer>>list= Arrays.asList(list1,list2,list3);
        System.out.println(list);

        Function<List<?>,Integer>size = List::size;

        Function<List<Integer>, Stream<Integer>>flatmapper = l->l.stream();

        list.stream()
                .map(size)
                .forEach(System.out::println);


    }
}