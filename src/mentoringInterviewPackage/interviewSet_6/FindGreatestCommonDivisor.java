package mentoringInterviewPackage.interviewSet_6;

import java.util.ArrayList;

// Given two positive integers m and n, find their greatest common divisor,
// that is, the largest positive integer that evenly divides both m and n.
// EX : if m = 15 and n = 25, then result greatest common divisor is = 5.
public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        findGreatestCommonDivisor(15, 25);
    }

    public static void findGreatestCommonDivisor(int a, int b) {
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                listA.add(i);
            }
        }

        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                listB.add(i);
            }
        }
        System.out.println(listA);
        System.out.println(listB);
        int greatestDivisor = 0;
        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j <listB.size(); j++) {
                if (listA.get(i) == listB.get(j)) {
                    greatestDivisor = listA.get(i);
                }
            }
        }

            System.out.println(greatestDivisor);
        }

    }

