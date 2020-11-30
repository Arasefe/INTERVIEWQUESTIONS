package cybertek_interviewPrep;

import java.util.ArrayList;
import java.util.List;

public class _18FINRA {
    /*
    Write a method which prints out the numbers from 1 to 30
    but for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {
        FINRA1();
        FINRA2();
        FINRA3();
    }

    public static void FINRA1() {
        String result = "";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA";
            } else if (i % 5 == 0) {
                result += "RA";
            } else if (i % 3 == 0) {
                result += "FIN";
            } else {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static void FINRA2() {
        String s = "";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                s += "FINRA";
            } else if (i % 5 == 0) {
                s += "RA";
            } else if (i % 3 == 0) {
                s += "FIN";
            } else {
                s += i;
            }
        }
        System.out.println(s);
    }

    public static void FINRA3() {
        List list = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FINRA");
            } else if (i % 5 == 0) {
                list.add("RA");
            } else if (i % 3 == 0) {
                list.add("FIN");
            } else {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void FINRA4(int boundary) {
        for (int i = 1; i <= boundary; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void FINRA5(int boundary){

        for (int i = 1; i <=boundary; i++) {
            System.out.print((i%3==0&&i%5==0)?"FINRA ":(i%3==0)?"FIN ":(i%5==0)?"RA ": String.valueOf(i)+" ");
        }
    }
}
