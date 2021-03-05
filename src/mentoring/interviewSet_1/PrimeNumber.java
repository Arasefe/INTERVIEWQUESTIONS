package mentoring.interviewSet_1;

public class PrimeNumber {
    //9.Create a method to check if the passing argument is a prime number
    // Prime number is the whole number that is divisible by itself and 1 only.
    // Prime number must be greater than 1

    public static void main(String[] args) {
        System.out.println(isPrime1(7));
        System.out.println(isPrime2(7));
    }


        public static boolean isPrime1(int num){
            if(num <= 1)
                return false;
            for(int i = 2; i <= Math.sqrt(num); i++){           // Math.sqrt(int a) returns the positive square root

                if(num%i == 0)
                    return false;
            }

            return true;
        }


        public static boolean isPrime2(int num){
            if(num<=1) return false;

            for(int i=2;i<num;i++){
                if(num%i==0) return false;
            }
            return true;
        }



}
