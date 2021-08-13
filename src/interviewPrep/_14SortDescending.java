package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _14SortDescending {

    public static void main(String[] args) {
        //sortDescending1();
        sortDescendingWithNestedLoop(new int[]{12,32,12,435,34,23,23});
    }



    public static void sortDescendingWithNestedLoop(int[]arr){

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



    public static void sortDescending1(){
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.addAll(Arrays.asList(23,32,43,12,12,42,3,23,45,564,1211));

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

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
