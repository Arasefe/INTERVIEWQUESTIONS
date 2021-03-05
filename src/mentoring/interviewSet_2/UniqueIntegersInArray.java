package mentoring.interviewSet_2;

import java.util.ArrayList;
import java.util.List;

public class UniqueIntegersInArray {
    //2.Complete a void method printUniqueNumbers() that will print all unique integers(non repeated ones)
    // from an array of ints. Every single unique int should be printed from the new line.

    public static void main(String[] args) {
        printUniqueNumbers1(new int[]{1, 2, 3, 2, 3, 3, 4, 5, 6, 43});
        printUniqueNumbers2(new int[]{1, 2, 3, 2, 3, 3, 4, 5, 6, 43});
    }

    public static void printUniqueNumbers1(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count == 1) {

                System.out.print(array[i] + " ");


            }
        }

    }


    public static void printUniqueNumbers2(int[] array) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int each : array) {
            int count = 0;
            for (int num : array) {
                if (num == each) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueList.add(each);
            }
        }
        System.out.println(uniqueList);

    }
}
