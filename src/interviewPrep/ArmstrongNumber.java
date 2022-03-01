package interviewPrep;

public class ArmstrongNumber {
    /*
	 	A number is called an Armstrong number if it is equal to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/

    public static void main(String[] args) {
        System.out.println("armstrong(153) = " + isArmstrong1(153));
        System.out.println("armstrong(153) = " + isArmstrong2(153));
        System.out.println("armstrong(153) = " + isArmstrong3(153));
        System.out.println("armstrong(371) = " + isArmstrong1(371));
        System.out.println("armstrong(371) = " + isArmstrong2(371));
        System.out.println("armstrong(371) = " + isArmstrong3(371));


    }

    public static boolean isArmstrong1(int num) {
        int comp = num;
        int digit = 0;
        int sumOfCubes = 0;

        while (num > 0) {                       // 1    5   3
            digit = num % 10;                   // 1    125 27=153
            num /= 10;
            sumOfCubes += (digit * digit * digit);
        }

        return comp == sumOfCubes;

    }

    public static boolean isArmstrong2(int num) {
        int comp = num;
        int digit = 0;
        int sum = 0;

        while (num > 0) {                           // 4    0   7
            digit = num % 10;                       // 64   0   343
            sum += (digit * digit * digit);
            num = num / 10;

        }
        if (comp == sum) {
            return true;
        } else return false;
    }

    public static boolean isArmstrong3(int num) {
        int digit = 0;
        int sum = 0;
        String strNum = String.valueOf(num);
        System.out.println(strNum);
        for (int i = 0; i < strNum.length(); i++) {                      // 4    0   7
            digit = Integer.parseInt("" + strNum.charAt(i));          // 64   0   343
            sum += (digit * digit * digit);
        }
        return sum==num;
    }
}
