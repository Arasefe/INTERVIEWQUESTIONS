package techproed.InterviewSet_Set1;

import java.util.Scanner;

public class TotalHundred {
    /*
    2.Write a method where u ask a user to enter a number until the total is 100
    or number of trials is equal to 3.
     */
    public static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        isTotalHundred();
    }

    private static void isTotalHundred(){

        int sum=0;
        int trials=0;
        while(sum < 100 && trials < 3){
            System.out.println("Enter a number!");
            sum += scan.nextInt();
            trials++;
            if(trials == 3)
                break;
            }

        if(sum >= 100)
            System.out.println("You made it! Your sum is " + sum);
        else if(trials == 3)
            System.out.println("You ran out of trials!!");
        }

}
