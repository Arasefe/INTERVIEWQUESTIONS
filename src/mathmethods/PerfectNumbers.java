package mathmethods;

public class PerfectNumbers {
    /*
 Create the method, it will take one int parameter and it will return true if the given value is perfect number.
 In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors,
 excluding the number itself.
 For instance, 6 has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number.
     */
    public static void main(String[] args) {
        boolean result=perfectNumbers2(28);
        System.out.println(result);
    }


    public static boolean perfectNumbers1(int num) {
        int sum = 0;
        for (int i = 1; i <num; i++){
            if(num%i==0){
                System.out.println(sum);
                sum+=i;
            }
        }
        return sum==num;
    }

    public static boolean perfectNumbers2(int num){

        int div=1;
        int sum=0;
        do{
            if(num%div==0){
                sum+=div;
            }
            div++;
        }while(div<num);
        if (sum==num) {

            return true;
        }else{
            return false;
        }
    }
}
