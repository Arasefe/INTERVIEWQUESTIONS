package interviewSet_1;

import java.util.Arrays;

public class SortArray {
    //4.Write a method where u sort an Array int[] without using the sort method

    public static void main(String[] args) {
        sortArray1(new int[]{4,3,2,8,1});
        sortArray2(new int[]{21,7,4,3,2,8,1});
    }
    public static void sortArray1(int []array){
        for(int i=0;i<= array.length-1;i++){
            int temp=0;
            for(int j=0;j<=array.length-1;j++){
                if(array[j]>array[i]){
                    temp= array[i];
                    array[i] =array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void sortArray2(int []array){
        // sortArray2(new int[]{21,7,4,3,2,8,1});
        int temp=0;
        for(int num:array){
            for(int each:array){
                if(each<num){
                    temp=num;
                    num=each;
                    each=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
