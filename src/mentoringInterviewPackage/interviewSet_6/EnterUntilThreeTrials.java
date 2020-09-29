package mentoringInterviewPackage.interviewSet_6;

import java.util.Scanner;

// Write a method where u enter numbers until 3 trials or sum up to 100
public class EnterUntilThreeTrials {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        enterThreeTrials();
    }

    public static void enterThreeTrials(){

        int sum=0;
        int count=0;
        while(count<3 && sum<100){
            System.out.println("Please enter a number again: ");
            int number=scanner.nextInt();
            sum+=number;
            count++;
        }
        System.out.println("sum = " + sum);

    }
}
