package ArraysPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorting1 {
    public static void main(String[] args) {
        int[] numbers = {12, 14, 23, 1, 234, 56, 45, 654};
        //sortArray1(numbers);
        //sortArray2(numbers);
        sortArray3(numbers);

    }

    public static void sortArray1(int[]numbers){
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp=numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void sortArray2(int[]numbers){
        int temp=0;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;

                }
            }

        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortArray3(int[]numbers){
        List<Integer> list=new ArrayList<>();
        for (int each:numbers) {
            list.add(each);
        }

        Collections.sort(list);
        System.out.println(list);
    }

    public static void sortArray4(int[]num){
        int temp=0;
        for(int i=0;i<num.length;i++){
            for(int k=i+1;k<num.length;k++){
                if(num[i]>num[k]){
                    temp=num[i];
                    num[i]=num[k];
                    num[k]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}

