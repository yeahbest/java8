package JavaCollections;

import com.intellij.openapi.editor.actions.LangIndentSelectionAction;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Krzysiek on 2017-04-09.
 */
public class lambdaseasy {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4);
        Stream<Integer>stream=list.stream();
        stream.forEach(System.out::println);

        Stream<String>StreamOfStrings=Stream.generate(()->"one");
        StreamOfStrings.limit(6).forEach(System.out::println);

        Stream<String>stringss= Stream.iterate("+",s->s+"+");
        stringss.limit(6).forEach(System.out::println);

        IntStream streamOfInts =ThreadLocalRandom.current().ints();
        streamOfInts.limit(6).forEach(System.out::println);
    }
}
