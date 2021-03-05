package mentoring.interviewSet_1;

import java.util.Arrays;

public class SortArray2 {
    // Sort a given array without using sort method

    public static void main(String[] args) {

        sortArray1(new int[]{32,342,43,566,78,3,9});

    }
    public static void sortArray1(int[]array){

        for (int i = 0; i < array.length; i++) {
            int temp=0;
            for (int j = 0; j < array.length ; j++) {
                if(array[j]>array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
