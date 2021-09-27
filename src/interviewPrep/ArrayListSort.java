package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 23, 4, 5, 6, 78, 9, 53, 56, 78));
        sortAsc(list);
    }

    public static void sortAsc(List<Integer> list) {
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void sortAsc2(List<Integer> list) {
        list.stream().sorted().forEach(System.out::print);
    }


    public static void sortDesc(List<Integer> list) {
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
