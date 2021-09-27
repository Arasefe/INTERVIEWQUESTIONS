package interviewPrep;

public class PrimeNumbers {

    public static void main(String[] args) {
        // Prime numbers are positive integers which are divided just by 1 and itself
        findAllPrimeNumbers2(10);



    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void findAllPrimeNumbers1(int limit) {

        if (limit < 1) {
            System.out.println("Enter a valid positive number");
        }

        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;
            for (int factor = 2; factor < number; factor++) {
                if (number % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number);
            }
        }
    }


    private static void findAllPrimeNumbers2(int limit){
        for (int i = 2; i <=limit; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
