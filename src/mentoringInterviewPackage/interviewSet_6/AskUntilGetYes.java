package mentoringInterviewPackage.interviewSet_6;

import java.util.Scanner;

public class AskUntilGetYes {
    public static void main(String[] args) {
        askUntilGetYes();
    }

    public static void askUntilGetYes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you believe in yourself?");
        String answer = scanner.next();
        if (answer.equals("yes")) {
            return;
        }
        while (!answer.equals("yes")) {
            System.out.println("Do you believe in yourself?");
            answer = scanner.next();
        }
    }
}
