package Java8;

import java.util.StringJoiner;

/**
 * Created by Pawl on 3/26/2017.
 */
public class Strings {
    public static void main (String...args){

        StringJoiner sj = new StringJoiner(", ","{","}");
        sj.add("one").add("two").add("three");

        System.out.println(sj);




    }
}
