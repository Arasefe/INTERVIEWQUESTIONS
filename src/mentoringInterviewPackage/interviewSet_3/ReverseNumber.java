package mentoringInterviewPackage.interviewSet_3;

import java.util.Scanner;

public class ReverseNumber {
    //5. Write a method to reverse a number

    public static void main(String[] args) {
        reverseInteger1(239);
        reverseInteger2(7429);
    }


    public static void reverseInteger1(int number) {
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            System.out.print(digit);

        }
        System.out.println();
    }

    public static void reverseInteger2(int input) {     // 562

        int reverse = 0;
        int remainder = 0;
        while (input > 0) {
            remainder = input % 10;                     // 2    6   5
            reverse = reverse * 10 + remainder;         // 2    26  265
            input = input / 10;
        }
        while (reverse > 0) {
            System.out.print(reverse % 10);
            reverse = reverse / 10;
        }

    }
}


