package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class _11ConcatTwoArrays {
    public static void main(String[] args) {
        concatArrays1(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
        concatArrays2(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
        concatArrays3(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
        int[] arr = concatArrays4(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
        System.out.println(Arrays.toString(arr));
        String[] ailem = concatArrays5(new String[]{"Aras", "Tulpar"}, new String[]{"Banu", "Ismail"});
        System.out.println(Arrays.toString(ailem));
    }

    public static void concatArrays1(int[] array1, int[] array2) {
        int[] combinedArray = new int[array1.length + array2.length];
        int i = 0;
        for (int each : array1) {
            combinedArray[i] = each;
            i++;
        }
        int j = array1.length;
        for (int num : array2) {
            combinedArray[j] = num;
            j++;
        }

        System.out.println(Arrays.toString(combinedArray));
    }

    public static void concatArrays2(int[] array1, int[] array2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array1) {
            list.add(each);
        }

        for (int num : array2) {
            list.add(num);
        }
        list.toArray();
        System.out.println(list);
    }

    public static void concatArrays3(int[] array1, int[] array2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array1) {
            list.add(each);
        }

        for (int each : array2) {
            list.add(each);
        }
        list.toArray();
        System.out.println(list);


    }

    public static int[] concatArrays4(int[] a, int[] b) {
        int[] concat = new int[a.length + b.length];
        int i = 0;
        for (int each : a) {
            concat[i] = each;
            i++;
        }
        for (int each : b) {
            concat[i] = each;
            i++;
        }

        return concat;
    }

    public static String[] concatArrays5(String[] a, String[] b) {
        String[] c = new String[a.length + b.length];
        int i = 0;
        for (String each : a) {
            c[i] = each;
            i++;
        }

        for (String each : b) {
            c[i] = each;
            i++;
        }
        return c;
    }
}








