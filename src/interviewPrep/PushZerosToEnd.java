package interviewPrep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PushZerosToEnd {

    public static void main(String[] args) {
        //pushZerosToEnd1(new int[]{2,4,0,3,0,6,7});
        //int[] numbers = pushZerosToEnd2(new int[]{0, 3, 1, 0, 5, 6, 7, 0});
        //System.out.println(Arrays.toString(numbers));

        //int[] arr = pushZerosToEnd2(new int[]{2, 4, 0, 3, 0, 6, 7});
        //System.out.println(Arrays.toString(arr));

        pushZerosToEnd4(new int[]{2, 4, 0, 3, 0, 6, 7});
    }

    public static void pushZerosToEnd1(int[] arr) {

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

    public static int[] pushZerosToEnd2(int[] arr) {
        int nonZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZero++] = arr[i];
            }
        }
        while (nonZero < arr.length) {
            arr[nonZero++] = 0;
        }

        return arr;
    }


    public static void pushZerosToEnd3(int arr[]) {

        List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int i = 0;
        for (Integer each : numbers) {
            if (each != 0) {
                arr[i++] = each;
            }
        }
    }

    public static void pushZerosToEnd4(int arr[]) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        


    }
}
