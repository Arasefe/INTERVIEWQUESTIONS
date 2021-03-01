package rahul;

public class _7Fibonacci {
    public static void main(String[] args) {
        fibonacci(9);
    }

    public static void fibonacci(int n){
        // 0 1 2 3 5 8 13 21 34
        int a=0;
        int b=1;
        int sum=1;
        int i=1;

        while(i<n){
            System.out.println(sum);
            a=b;
            b=sum;
            sum=a+b;
            i++;
        }
    }
}
