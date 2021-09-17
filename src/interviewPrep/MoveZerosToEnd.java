package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        moveZeros1(new int[]{1, 2, 0, 3, 0, 34, 6});
        moveZeros2(new int[]{1, 2, 0, 3, 0, 34, 6});

    }

    public static void moveZeros1(int[] arr) {
        List<Integer>moved=new LinkedList<>();
        for (int each : arr) {
            if(each!=0){
                moved.add(each);
            }
        }
        while(moved.size()<arr.length){
            moved.add(0);
        }
        System.out.println(moved);


    }

    public static void moveZeros2(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp = arr[count];
                arr[count++] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void moveZeros3(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length)
            arr[count++] = 0;
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeros4(int[] arr) {
        int nonZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZero++] = arr[i];
            }
        }
        while (nonZero < arr.length) {
            arr[nonZero++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}



