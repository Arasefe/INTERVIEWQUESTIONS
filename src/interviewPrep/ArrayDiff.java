package interviewPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDiff {
     /*
	 	Create a function that takes an array and
	 	returns the difference between the biggest and the smallest numbers.
	    Ask user to enter array elements.
	*/

    public static void main(String[] args) {
        arrayDiff(arrayGenerator());
    }


    private static int[] arrayGenerator(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please tell the size of the array");
        int size=scan.nextInt();
        int[]arr=new int[size];
        int min=1;
        int max=500;

        for (int i = 0; i < size; i++) {
            arr[i]=(int)(min + (Math.random() * (max - min)));
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }
    private static void arrayDiff(int[]arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max: "+max+ " Min: "+min+" The difference: "+(max-min));

    }



}


