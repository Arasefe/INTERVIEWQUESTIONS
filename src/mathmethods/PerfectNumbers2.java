package mathmethods;

public class PerfectNumbers2 {
    public static boolean perfectNumberMethod(int number2) {
        /*
 Create the method, it will take one int parameter and it will return true if the given value is perfect number.
 In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors,
 excluding the number itself.
 For instance, 6 has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number.
         */
        int number1 = 0;
        int i = 0;
        int divident = 2, primeStatus;

        while (number1 <= number2) ;
        {
            number1++;
            primeStatus = 0;
            if (primeStatus == 0) {
                System.out.println(number1);

                while (divident < number1){
                    divident++;
                    if (number1 % divident == 0) {
                        primeStatus = 1;
                    }
                }
            }


            return true;
        }
    }
    public static void main(String[] args) {
        perfectNumberMethod(10);
    }
}
