package ArraysPackage;

import java.util.Arrays;

public class ArrayMin {
    public static void main(String[] args) {

        findMin2(new int[]{11, 56, 78, 2, 5, 7, 9, 1});
    }


    public static void findMin1(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }


    public static void findMin2(int[] num) {
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("Min: "+num[0]);
        System.out.println("Max: "+num[num.length-1]);
        System.out.println(Arrays.toString(num));
    }


}
