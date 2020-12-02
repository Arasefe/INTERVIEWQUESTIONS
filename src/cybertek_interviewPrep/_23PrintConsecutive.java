package cybertek_interviewPrep;
/*
Write a function:

that, given a positive integer N, prints the consecutive numbers from 1 to N,
each on a separate line. However, any number divisible by 2, 3 or 5
should be replaced by the word Codibility, Test or Coders respectively.
If a number is divisible by more than one of the numbers:
2,3 or 5, it should be replaced by a concatenation of the respective words
Codility, Test and Coders in this given order.
For example, numbers divisible by both 2 and 3 should be replace by
CodilityTest and numbers divisible by all three numbers:
2,3 and 5, should be replaced by CodibilityTestCoders.


 */

public class _23PrintConsecutive {

    public static void main(String[] args) {

    }


    public static void printConsecutiveNumbers(int num) {
        // 2: Codility
        // 3: Test
        // 5: Coders
        // 6: CodilityTest
        // 10:CodilityCoders
        // 15: TestCoders
        // 30: CodilityTestCoders

        for (int i = 1; i <= num; i++) {

            if (i % 30 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 15 == 0) {
                System.out.println("TestCoders");
            } else if (i % 10 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 6 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else {
                System.out.println(i);
            }

        }

    }
}
