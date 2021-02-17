package streamsPackage;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates(new LinkedList<Integer>(Arrays.asList(1,23,45,6,6)));
        removeDuplicates2(new LinkedList<Integer>(Arrays.asList(1,23,45,6,6)));
    }
    // Simply assign to Set
    public static void removeDuplicates(List<Integer> list){
        Set<Integer>nonDup=new HashSet<>(list);
        System.out.println(nonDup);
    }

    // With Stream
    public static void removeDuplicates2(List<Integer> list){
        List<Integer> listWithoutDuplicates = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);
    }
}
