package interviewPrep;

public class PrimeNumbers {

    public static void main(String[] args) {
        // Prime numbers are positive integers which are divided just by 1 and itself
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(1));
        System.out.println(primeNumber(6));
        System.out.println(primeNumber2(13));
        System.out.println(primeNumber2(1));
        System.out.println(primeNumber2(6));
    }

    public static boolean primeNumber(int num) {
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

    private static boolean primeNumber2(int num) {
        // L
        int counter = 0;
        if (num > 0) {
            if (num == 1) {
                return true;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    return true;
                } else {
                    return false;
                }
            }

        } else {
            return false;
        }

    }
}
