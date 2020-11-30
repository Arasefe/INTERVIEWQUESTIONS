package cybertek_interviewPrep;

public class _19DivideWOO {
    /*
    Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {
        divideWithOutOperator(13,3);
    }

    public static void divideWithOutOperator(int num1, int num2){
        if(num2==0){
            System.out.println("Invalid divisor");
            return;
        }
        System.out.print(num1 +" divided by "+num2 +" is: ");

        int count = 0;

        while(num1 >= num2) {
            num1 -= num2;
            count++;

        }

        System.out.println(count+" and remainder is "+num1);


    }
}
