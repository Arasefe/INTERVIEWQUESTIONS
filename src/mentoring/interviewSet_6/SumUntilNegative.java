package mentoring.interviewSet_6;

import java.util.Scanner;
// Write a method where u return the total until user enters a negative.
public class SumUntilNegative {
    public static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        sumUntilNegative();
    }

    public static void sumUntilNegative(){
        System.out.println("Please enter a number: ");
        int number=scan.nextInt();
        int sum=0;
        while(number>=0){
            System.out.println("Please enter another number: ");
            number=scan.nextInt();
            sum+=number;
        }
        System.out.println("sum = "+sum);

    }
}
