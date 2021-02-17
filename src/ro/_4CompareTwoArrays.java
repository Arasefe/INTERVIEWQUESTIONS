package ro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4CompareTwoArrays {
    public static void main(String[] args) {
        compareSameIndexes(new int[]{1, 2, 3, 4, 5}, new int[]{0, 2, 6, 8, 5});
    }

    public static void compareSameIndexes(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                list.add(arr1[i]);
            }

        }
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
