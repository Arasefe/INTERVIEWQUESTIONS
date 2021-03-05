package mentoring.interviewSet_2;

import java.util.Arrays;

public class MergeArrays {
    //4.merge merges two arrays into one. it gets two int arrays and returns a combined array
    //for example: merge([1,2,3],[4,5,6]) --> returns [1,2,3,4,5,6]

    public static void main(String[] args) {
        mergeArrays(new int[]{1,2,3,4,5},new int[]{6,7,8,9});
    }

    public static void mergeArrays(int []array1, int[]array2){
        int[]combinedArray=new int[array1.length+ array2.length];
        int i=0;
        for(int each:array1){
            combinedArray[i]=each;
            i++;
        }
        int j= array1.length;
        for(int each:array2){
            combinedArray[j]=each;
            j++;
        }

        System.out.println(Arrays.toString(combinedArray));
    }

}
