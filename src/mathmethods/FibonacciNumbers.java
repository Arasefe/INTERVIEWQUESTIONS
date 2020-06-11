package mathmethods;

public class FibonacciNumbers {
    /*
    Create a method it will take one parameter as a int array and
    the method will return sorted array. (Do not use sort method.)
     */
    public static void methodFibonacci(int num){
        int preNum1=1;
        int preNum2=2;
        int count=0;
        int sum;
        for(int i=2;i<=num;i++){
            if (preNum2 > num) {
                break;
            }
            System.out.println(preNum1+ "");
            sum=preNum1+preNum2;
            preNum1=preNum2;
            preNum2=sum;
            count++;
        }
    }
    public static void main(String[] args) {
        methodFibonacci(345678);
    }

}
