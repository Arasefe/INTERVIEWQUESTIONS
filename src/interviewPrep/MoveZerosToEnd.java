package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 0, 4, 5, 0, 4, 0, 1, 3, 4));
        int[] lst = new int[]{1, 2, 0, 4, 5, 0, 4, 0, 1, 3, 4};
        int[]arr =moveZeros1(lst);
        //System.out.println(Arrays.toString(arr));
        //moveZeros2(lst);
        moveZeros3(lst);

    }

    public static int[] moveZeros1(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for (int each : arr) {
            list.add(each);
            countZero += (each == 0) ? 1 : 0;

        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for (int i = 0; i < arr.length - countZero; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


    public static void moveZeros2(int[] numbers) {

        int[] array1 = new int[numbers.length];
        int i;
        int temp;
        int count = 0;
        for (i = 0; i < numbers.length; i++) {
            if ((numbers[i] != 0)) {
                temp = numbers[count];
                numbers[count] = numbers[i];
                numbers[i] = temp;
                count = count + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void moveZeros3(int[]arr){
        int[]moved=new int[arr.length];
        int temp=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp=arr[count];
                arr[count++]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
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



