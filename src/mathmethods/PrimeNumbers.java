package mathmethods;

public class PrimeNumbers {
    public static void main(String[] args) {
        primeNumbers1(7);

    }

    public static void primeNumbers1(int number) {
        String result="";
        if(number<=2){
            result="Not Prime";
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                result="Not Prime";
            } else {
                result="Prime";
            }
        }
        System.out.println(result);
    }


}

