package recursion;

public class Factorial2 {
    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n *(n - 1)!

    public static void main(String[] args) {
        //System.out.println(recursiveFactorial1(5));
        System.out.println(recursiveFactorial2(5));
        System.out.println(recursiveFactorial3(5));

    }

    public static int recursiveFactorial1(int num){

        if(num==0){             //num==0
            return 1;           //return 1;
        }
        return num*recursiveFactorial1(num-1);
    }


    public static int recursiveFactorial2(int num){
        if(num==0){
            return 1;
        }
        return num*recursiveFactorial2(num-1);
    }
    public static int recursiveFactorial3(int num){
        if(num==1){
            return num;
        }
        return num*recursiveFactorial1(num-1);
    }
}
