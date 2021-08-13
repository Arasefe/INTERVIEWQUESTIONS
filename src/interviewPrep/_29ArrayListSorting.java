package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _29ArrayListSorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 23, 4, 5, 6, 78, 9, 53, 56, 78));
        sortingArrayListAsc2(list);
    }

    public static void sortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void sortingArrayListAsc2(List<Integer> list) {
        list.stream().sorted().forEach(System.out::print);
    }

    public static void SortingArrayListDesc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
