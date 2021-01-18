package recursion;

public class Factorial1 {
    public static void main(String[] args) {
        System.out.println(factorialMethod1(6));

    }




    public static int factorialMethod1(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;

    }

    public static int factorialMethod2(int num){
        if(num==0){
            return 1;
        }
        int factorial=1;
        for (int i = 1; i <= num; i++) {
            factorial*=i;
        }
        return factorial;
    }
}
