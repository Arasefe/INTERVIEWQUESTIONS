package Arrays;

import java.util.Arrays;

public class ArraySorting1 {
    public static void main(String[] args) {
        int[] numbers = {12, 14, 23, 1, 234, 56, 45, 654};

        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp=numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(numbers));


    }
}

