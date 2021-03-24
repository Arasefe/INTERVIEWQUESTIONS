package lambdaPackage.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WorkingStreams2 {
    public static void main(String[] args) {
        // Write the words more than five characters
        String[]wordsArr=new String[]{"Hello","Functional","Programming","is","coool"};
        List<String>words=new ArrayList<>(Arrays.asList(wordsArr));

        Predicate<String> isLongerThan5=(str)->str.length()>5;
                List<String>longWords=words
                .stream()
                .filter(isLongerThan5)
                .collect(Collectors.toList());

        System.out.println(longWords);

    }
}
