package hackerRank;

import java.util.Scanner;

public class _1CostOfBalloons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) { //number of test cases
            if (T >= 1 && T <= 10) {
                int c1 = sc.nextInt();
                int c2 = sc.nextInt();
                int n = sc.nextInt();
                int count1 = 0;
                int count2 = 0;
                for (int i = 1; i <= n; i++) {
                    int f = sc.nextInt();
                    if (f == 1) {
                        count1++;
                    }
                    int s = sc.nextInt();
                    if (s == 1) {
                        count2++;
                    }
                }
                int min1 = count1 * c1 + count2 * c2;
                int min2 = count1 * c2 + count2 * c1;
                int min = (min1 < min2 ? min1 : min2);
                System.out.println(min); // returning mimimum cost

            } else
                System.out.println(-1);
            T--;//ending the while loop
        }
    }
}
