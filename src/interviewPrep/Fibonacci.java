package interviewPrep;

import javax.security.sasl.SaslClientFactory;
import java.util.Arrays;

public class Fibonacci {
//  1 1 2 3 5 8 13 21
// Write a return method that returns the  Fibonacci of any given number index
    public static void main(String[] args) {
        //System.out.println(fibonacci1(3));
        //fibonacci3(8);
        int[]arr=fibonacci2(8);
        System.out.println(Arrays.toString(arr));
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


    private static int[] fibonacci2(int num){
        int first=0;
        int second=1;
        int last=1;
        int[]fibs=new int[num];
        for (int i = 0; i <num ; i++) {
            fibs[i]=first;
            first=second;
            second=last;
            last=first+second;

        }
        return fibs;
    }


    private static void fibonacci3(int limit){
        int fFib=0;
        int sFib=1;
        int lFib=1;
        for (int i = 0; i <=limit ; i++) {
            System.out.println(fFib + " ");
            fFib=sFib;
            sFib=lFib;
            lFib=fFib+sFib;

        }
    }
}
