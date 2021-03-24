package saggezza;

import java.util.Arrays;

public class ArrayRotation {
    /*
    A left rotation operation on an array of size N shifts each of the array's elements 1 unit to the left.
    For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
    Given an array of N integers and a number, D, perform D left rotations on the array
    */
    public static void main(String[] args) {
        arrayRotation1(new int[]{1, 2, 3, 4, 5}, 3);
    }

    public static void arrayRotation1(int[] arr, int x) {

        int[] rotatedArray = new int[arr.length];
        int j = 0;
        for (int i = x - 1; i < arr.length; i++) {
            rotatedArray[j] = arr[i];
            j++;
        }

        for (int i = 0; i < x-1; i++) {
            rotatedArray[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(rotatedArray));
    }

    public static void arrayRotation2(int[] arr, int x) {

    }
}

