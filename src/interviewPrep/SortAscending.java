package interviewPrep;

import java.util.Arrays;

public class SortAscending {
    // create a method that sorts a int[] without using sort method
    public static void main(String[] args) {
        sortAscending1();
        sortAscending2();
        //sortAscending3();
        //sortAscending4();

        //sortDescending1();
        //sortDescending2();
    }


    public static void sortAscending1() {
        int[] arr = new int[]{121, 23, 432, 54, 65, 76, 234};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];        // 121
                    arr[i] = arr[j];      // 23
                    arr[j] = temp;        // 121
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void sortAscending2() {
        int[] arr = new int[]{13, 12, 32, 43, 64, 768, 45, 24, 1212};

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void sortAscending3() {
        int[] arr = new int[]{6, 3, 5, 2, 7, 4, 45, 8, 11};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void sortAscending4() {
        int[] intArr = new int[]{3, 45, 6, 76, 877, 3234};

        for (int i = 0; i < intArr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] > intArr[i]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArr));
    }

    public static void sortDescending1() {
        int[] arr = new int[]{6, 3, 5, 2, 7, 4, 45, 8, 11};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sortDescending2() {
        int[] arr = new int[]{6, 3, 5, 2, 7, 4, 45, 8, 11};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
