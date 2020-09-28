package mentoringInterviewPackage.interviewSet_4;

public class Factorial {
    //4.In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.  Write a method that Calculate factorial and output result to the console.
    public static void main(String[] args) {
        long result=factorialRecursive(5);
        System.out.println(result);

        long res=factorialConventional(6);
        System.out.println(res);

    }

    public static long factorialRecursive(int n){
        if(n==0){
            return 1;
        }
        return factorialRecursive(n-1)*n;
    }

    public static long factorialConventional(int number){       // 6
        long factorial=1;
        if(number==0){
            return 1;
        }
        for (int i =number; i >=1 ; i--) {                      // 6    5   4   3   2
            factorial*=i;
        }
        return factorial;
    }
}
