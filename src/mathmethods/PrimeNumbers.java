package mathmethods;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            int number= input.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

                for (int j = 2; j <= i; j++) {

                    if (number % j == 0) {
                        isPrime = false;

                    }

                }isPrime=false;
            System.out.println(i);
            }
        }
    }

