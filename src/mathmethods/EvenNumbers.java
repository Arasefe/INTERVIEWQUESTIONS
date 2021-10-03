package mathmethods;

public class EvenNumbers {
    /*
    Please find the even numbers in between two numbers.
    Even number is the number that can be divided by two and the remainder must be 0.
    We use % operator for finding the even/odd number.
     */

    public static void main(String[] args) {
        findEvenNumbers(12, 200);
    }

    public static void findEvenNumbers(int a, int b) {
        /*
     You can call the findEvenNumbers(int a, int b) method and pass two arguments
     */
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println(Math.random());
    }
}


