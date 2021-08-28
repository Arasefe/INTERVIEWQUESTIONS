package interviewPrep;

public class ArmstrongNumber {
    /*
    Armstrong number is a number that is equal to the sum of cubes of its digits.
    For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
     */

    public static void main(String[] args) {
        System.out.println("armstrong(153) = " + armstrong1(153));
        System.out.println("armstrong(407) = " + armstrong2(153));
    }

    public static boolean armstrong1(int num) {

        int a = 0, b = 0, c = num;
        //      3      25     153
        while (num > 0) {                   // 1    5   3
            a = num % 10;                   // 3    125 27=153
            num /= 10;
            b +=  (a * a * a);
        }

        if (c == b) {
            return true;
        }

        return false;
    }

    public static boolean armstrong2(int num){
        int a=0,b=0,c=num;

        while(num>0){
            a=num%10;
            num=num/10;
            b+=(a*a*a);
        }
        if(c==a){
            return true;
        }
        else return false;
    }
}
