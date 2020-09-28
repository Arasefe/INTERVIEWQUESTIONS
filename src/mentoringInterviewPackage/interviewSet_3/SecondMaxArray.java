package mentoringInterviewPackage.interviewSet_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SecondMaxArray {
    public static void main(String[] args) {
        //1. FiND THE SECOND MAX in AN ARRAY THAT CONSISTS OF 10 RANDOM NUMBERS?DONT USE SORT METHOD


    }

    public static ArrayList<String> permutation(String str, String ans) {

        ArrayList<String> list = new ArrayList<>();

        if (str.length() == 0)
            list.add(ans);


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(i + 1);

            permutation(ros, ans + ch);

        }

        return list;
    }


    //5
    public static String reverseANumber5(int num) {

        String reversed = "";

        if (num == 0)
            return "0";

        while (num > 0) {

            reversed += num % 10;
            num /= 10;
        }

        return reversed;
    }


    //4
    public static boolean isArmstrong4(int num) {


        int sum = 0;
        int temp = num;

        while (num > 0) {

            int eachDigit = num % 10;
            sum += eachDigit * eachDigit * eachDigit;
            num = num / 10;
        }

        if (sum == temp)
            return true;


        return false;
    }


    //3
    public static int sumOfAllDigits3(int num) {

        int sum = 0;

        while (num > 0) {

            sum += num % 10;
            num = num / 10;

        }
        return sum;
    }


    //2
    public static void findSecondLowest2() {

//		 int[] arr = createAnArray();
//
//		 System.out.println(Arrays.toString(arr));
//
//		 for(int j = 0; j < arr.length - 1; j++){
//
//				for(int i = 0; i < arr.length - 1; i++) {
//
//				if(arr[i] > arr[i + 1]) {
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//				}
//
//		}
//			System.out.println(Arrays.toString(arr));
//			System.out.println("Second min is : " + arr[1]);

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        int[] array = createAnArray();
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                secondLowest = lowest;
                lowest = array[i];
            } else if (array[i] < secondLowest)
                secondLowest = array[i];
        }
        System.out.println(secondLowest);


    }


    //1
    public static void findSecondHighest1() {

        int[] arr = createAnArray();

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length - 1; j++) {

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Second max is : " + arr[1]);

//			 int highest = Integer.MIN_VALUE;
//			 int secondHighest = Integer.MIN_VALUE;
//
//			  int[] array = createAnArray();
//			  System.out.println(Arrays.toString(array));
//
//		        for (int i = 0; i < array.length; i++) {
//		            if (array[i] > highest) {
//		                secondHighest = highest;
//		                highest = array[i];
//		            } else if (array[i] > secondHighest)
//		                secondHighest = array[i];
//		        }
//		        System.out.println(secondHighest);


    }


    //create an array of random numbers
    public static int[] createAnArray() {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }

        return arr;
    }
}
