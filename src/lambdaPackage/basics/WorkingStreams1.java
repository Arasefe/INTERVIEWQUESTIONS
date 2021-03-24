package lambdaPackage.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WorkingStreams1 {
    public static void main(String[] args) {
        Integer[]intArray=new Integer[]{1,2,3,4,5,6,7,8,9};
        List<Integer>list=new ArrayList<>(Arrays.asList(intArray));

        Function<Integer,Integer>timesTwo=(x)->x*2;
        List<Integer>doubled=list
                                .stream()
                                .map(timesTwo)
                                .collect(Collectors.toList());
        System.out.println(doubled);

        Predicate<Integer>isEven=(x)->x%2==0;
        List<Integer>evens=list
                .stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.println(evens);
    }
}
