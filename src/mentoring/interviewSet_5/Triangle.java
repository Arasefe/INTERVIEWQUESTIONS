package mentoring.interviewSet_5;

public class Triangle {
    // Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.
	/*	Example:
		input: 3
		output: *
		output: **
		output: ***
	*/

    public static void main(String[] args) {
        triangle(3);
    }

    public static void triangle(int number){
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }







}
