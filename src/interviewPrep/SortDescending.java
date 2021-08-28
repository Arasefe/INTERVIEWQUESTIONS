package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDescending {

    public static void main(String[] args) {

        //sortDescending1(new int[]{12,32,12,435,34,23,23});
        sortDescending2(new int[]{12,32,12,435,34,23,23});
    }



    public static void sortDescending1(int[]arr){

        for(int i=0; i<arr.length; i++){

            for(int j =0; j < arr.length;j++) {

                if(arr[i] > arr[j]){

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }



    public static void sortDescending2(int[]arr){
        // Arrays.asList(int[]) returns a List<int[]> not List<Integer>
        List<int[]> list=Arrays.asList(arr);
        for (int[] each : list) {
            System.out.println(Arrays.toString(each));
        }


        System.out.println(list.stream().sorted());

        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

    public static void sortDescending2( ArrayList<Integer> aList){
        int  max=Integer.MIN_VALUE;
        for (int i = 0; i < aList.size(); i++) {
            //if(aList.get(i)>max) max=
            for (int j = 0; j < aList.size(); j++) {

            }
        }
    }
}
