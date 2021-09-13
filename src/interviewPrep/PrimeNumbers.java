package interviewPrep;

public class PrimeNumbers {

    public static void main(String[] args) {
        // Prime numbers are positive integers which are divided just by 1 and itself
        System.out.println(primeNumber1(13));
        primeNumber2(13);


    }

    public static boolean primeNumber1(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void primeNumber2(int number) {
        int count = 0;
        if (number > 0) {
            if (number == 1) {
                System.out.println(number + " is prime number");
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(number + " is prime");
                } else {
                    System.out.println(number + " is not prime");
                }
            }
        } else {
            System.out.println("Enter a positive integer");
        }

    }
}
