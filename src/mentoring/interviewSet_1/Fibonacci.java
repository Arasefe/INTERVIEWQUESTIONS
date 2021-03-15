package mentoring.interviewSet_1;

public class Fibonacci {
    /*
    7.In fibonacci series, next number is the sum of previous two numbers
    for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89, 144 . . .
    The first two numbers of fibonacci series are 0 and 1.
    Given a number num, print n-th Fibonacci Number.
     */

    public static void main(String[] args) {
        fibonacciSeries1(3);
        //fibonacciSeries2(3);
        //fibonacciSeries1(3);
        //fibonacciSeries1(3);
    }

    public static void fibonacciSeries1(int number) {
        // 0,1,1,2,3,5,8,13,21,34.....
        int result = 0;
        int a = 0;              // first number
        int b = 1;              // second number
        int c;                  // this is next number
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


    public static void fibonacciSeries2(int num){
        int result=0;
        int a=0;
        int b=1;
        int c;
        if(num==0){
            result=a;
        }
        for (int i = 2; i <=num; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        result=b;
        System.out.println(result);
    }
}
