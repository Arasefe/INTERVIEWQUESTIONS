package interviewPrep;

public class ArmstrongNumber {
    /*
	 	A number is called an Armstrong number if it is equal to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/

    public static void main(String[] args) {
        System.out.println("armstrong(153) = " + armstrong1(153));
        System.out.println("armstrong(407) = " + armstrong2(407));
    }

    public static boolean armstrong1(int num) {

        int digit = 0;
        int sumOfCubes = 0;

        while (num > 0) {                       // 1    5   3
            digit = num % 10;                   // 3    125 27=153
            num /= 10;
            sumOfCubes +=  (digit * digit * digit);
        }

        if (num == sumOfCubes) {
            return true;
        }

        return false;
    }

    public static boolean armstrong2(int num){
        int digit=0;
        int sum=0;

        while(num>0){                           // 4    0   7
            digit=num%10;                       // 64   0   343
            num=num/10;
            sum+=(digit*digit*digit);
        }
        if(num==sum){
            return true;
        }
        else return false;
    }
}
