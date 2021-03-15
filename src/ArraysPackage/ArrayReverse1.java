package ArraysPackage;

import java.util.Arrays;

public class ArrayReverse1 {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};
        //reverse1(array);
        reverse2(array);
        reverse3(array);
        reverse4(array);

    }

    private static void reverse1(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    public static void reverse2(int[] array) {
        int temp = 0;
        int maxInd = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            array[i] = array[maxInd - i];
            array[maxInd - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void reverse3(int[] nums) {
         /*
        Create a method it will take one parameter as an int array and
        the method will return reversed value of the array.
        (do it without using reverse method)
         */
        int reverse[] = new int[nums.length];
        for (int i = 0, k = nums.length - 1; i < nums.length; i++, k--) {
            reverse[i] = nums[k];
            System.out.println(reverse[i]);
        }
        System.out.println(Arrays.toString(reverse));       // print the reversed array as a String
    }

    public static void reverse4(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reverse[i] = array[j];
        }
        System.out.println(Arrays.toString(reverse));

    }
}




