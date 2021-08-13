package interviewPrep;

public class _24Fibonacchi {
//  1 1 2 3 5 8 13 21
// Write a return method that returns the  Fibonacci of any given number index
    public static void main(String[] args) {
        System.out.println(fib(3));

    }

    public static int fib(int num) {

        int result = 0;
        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
        // 0 1 1 2 3 5 8 13 21 34
            result = a + b;         // 1    2   3   5
            a = b;                  // a=1  1   2   3
            b = result;             // b=1  2   3   5

        }

        return result;
    }
}
