package rahul;

public class _8PrimeNumbers {

    public static void main(String[] args) {

        //primeNumbers(3);
        boolean r=primeNumbers2(13);
        System.out.println(r);
    }

    public static void primeNumbers1(int num){
        for (int i = 2; i < num; i++) {
            if(num%i!=0){
                System.out.println(num+" is Prime");
            }else{
                System.out.println(num+" is not Prime");
            }
        }

    }

    public static boolean primeNumbers2(int num){       //8
        boolean result=false;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                result=false;
                break;
            }else if(num%i!=0){
                result=true;
            }
        }
        return result;
    }
}
