package mostCommonIQ;

public class _5FindSumOfAllDigits {
    public static void main(String[] args) {
        sumOfAllDigits(39723);
    }

    public static void sumOfAllDigits(int number){
        int sum=0;
        while(number!=0){
            int digit=number%10;            //3
             number=number/10;              //3972
            sum+=digit;
        }
        System.out.println(sum);
    }

}
