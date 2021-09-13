package interviewPrep;

public class Fibonacci {
//  1 1 2 3 5 8 13 21
// Write a return method that returns the  Fibonacci of any given number index
    public static void main(String[] args) {
        System.out.println(fibonacci1(3));

    }

    public static int fibonacci1(int num) {

        int lastFib = 0;
        int firstFib = 0;
        int secondFib = 1;

        for (int i = 0; i < num; i++) {
        // 0 1 1 2 3 5 8 13 21 34
            lastFib = firstFib + secondFib;         // 1    2   3   5
            firstFib = secondFib;                   // a=1  1   2   3
            secondFib = lastFib;                    // b=1  2   3   5

        }

        return lastFib;
    }


    private static void fibonacci2(int num){
        int result=0;
        int x=0;
        int y=1;
        for (int i = 0; i <=num ; i++) {
            result=x+y;
            x=y;
            y=result;
        }
    }
}
