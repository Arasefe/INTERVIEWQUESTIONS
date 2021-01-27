package cybertek_interviewPrep;

public class _35PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(primeNumber(13));
    }

    public static boolean primeNumber(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i < num; i++) {    //50
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
