package ro;

import java.util.Arrays;

public class _5SortArray<T> {
    public static void main(String[] args) {
        sortArrayAsc(new int[]{29,32,3,1,43,43,5});
        sortArrayAsc(new int[]{29,32,3,1,43,43,5});

    }
    public static void sortArrayAsc(int []arr){

        for (int i = 0; i < arr.length; i++) {
            int temp=0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArrayDesc(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int temp=0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
