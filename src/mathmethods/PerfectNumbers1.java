package mathmethods;

public class PerfectNumbers1 {
    /*
 Create the method, it will take one int parameter and it will return true if the given value is perfect number.
 In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors,
 excluding the number itself.
 For instance, 6 has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number.
     */
    public static boolean perfectNumbersMethod(int num) {
        int sum = 0;
        int i = 0;
        for (i = 1; i <num; i++){                   //1
            if(num%1==0){                           //
                sum+=num;                           //
                System.out.println(sum);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        perfectNumbersMethod(6);
    }
}
