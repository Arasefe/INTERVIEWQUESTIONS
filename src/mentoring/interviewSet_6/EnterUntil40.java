package mentoring.interviewSet_6;

import java.util.Scanner;

public class EnterUntil40 {
    //2.Write a method where u enter numbers until the total is 40
    public static void main(String[] args) {
        enterUntil40();
    }
    public static void enterUntil40(){
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        while (sum<40){
            System.out.println("Please enter a number again: ");
            int number=scanner.nextInt();
            sum+=number;
        }

    }
}
