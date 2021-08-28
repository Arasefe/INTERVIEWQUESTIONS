package interviewPrep;

public class DivisibleBy3_5_15 {
    /*
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

    if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibleBy15' section

    if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3' section

    if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5' section
     */

    public static void main(String[] args) {
        //divisibleByV1(100);
        divisibleByV2(100);
    }

    public static void divisibleByV1(int N) {
        String result = "";

        for (int i = 1; i <= N; i++) {
            if (i % 15 == 0) {
                result = "Divisible by 15";
            } else if (i % 3 == 0) {
                result = "Divisible by 3";
            } else if (i % 5 == 0) {
                result = "Divisible by 5";
            } else {
                result = "" + i;
            }
            System.out.print(result + " ");
        }


    }


    public static void divisibleByV2(int N) {
        String result = "";
        for (int i = 1; i <= N; i++) {
            result = (i % 15 == 0) ? "Divisible By 15" : (i % 5 == 0) ? "Divisible By 5" : (i % 3 == 0) ? "Divisible By 3" : "" + i;
            System.out.print(result + " ");
        }

    }
}
