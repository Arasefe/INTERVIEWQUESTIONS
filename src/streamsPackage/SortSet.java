package streamsPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SortSet {
    public static void main(String[] args) {
        methodSort();
    }
    public static void methodSort(){
        Set<Integer>set=new HashSet<>(Arrays.asList(1,432,43,23,1342));
        System.out.println(set);
        Set<Integer> set1 = set.stream().collect(Collectors.toSet());
        System.out.println(set1);
    }
}
