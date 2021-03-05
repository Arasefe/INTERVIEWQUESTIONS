package mentoring.interviewSet_1;

public class Fibonacci {
    /*
    7.In fibonacci series, next number is the sum of previous two numbers
    for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89, 144 . . .
    The first two numbers of fibonacci series are 0 and 1.
    Given a number num, print n-th Fibonacci Number.
     */

    public static void main(String[] args) {
        fibonacciSeries(3);
    }

    public static void fibonacciSeries(int number) {
        // 0,1,1,2,3,5,8,13,21,34.....
        int result = 0;
        int a = 0;              //first number
        int b = 1;              // second number
        int c;                  //this is next number
        if (number == 0) {
            result = a;
        }
        for (int i = 2; i <= number; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        result = b;
        System.out.println(result);
    }
}
