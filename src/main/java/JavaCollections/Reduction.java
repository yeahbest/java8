package JavaCollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by Pawl on 4/5/2017.
 */
public class Reduction {
    public static int reduce(
        List<Integer>values,
        int valuieIfEmpty,
        BinaryOperator<Integer>reduction){
        int result = valuieIfEmpty;
        for(int value:values){
            result=reduction.apply(result,value);
        }
        return result;
    }
    public static void main(String... args) {

        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        List<Integer>ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer>ints2 = Arrays.asList(-1,-2,-3-4);

        BinaryOperator<Integer>op = Integer::max;

        int reduction = reduce(ints,0,op);
        System.out.println("REDUCTION: "+reduction);


    }
}
