package interviewPrep;

public class IsoscelesRightTriangle {
    /*
	 Type code to draw isosceles right triangle whose side length will be given by user.
	 For example; if the side is 5 triangle will be like;   *
															* *
															*   *
															*     *
															* * * * *
	 */

    public static void main(String[] args) {
        isoscelesRightTriangle1(5);
    }

    private static void isoscelesRightTriangle1(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }


    public static void isoscelesRightTriangle2(int sideLength) {
        int line = 1;
        System.out.println("*");
        for (int i = 1; i < sideLength; i++) {
            line = 2 * i - 1;
            int count = 0;
            if (i <= line) {
                System.out.print("*");
                for (int k = 0; k < line; k++) {
                    if (i < sideLength - 1) {
                        System.out.print(" ");
                    } else if (i == sideLength - 1) {
                        System.out.print(" *");
                        count++;
                        if (count == sideLength - 1) {
                            break;
                        }
                    }
                }
                if (count < sideLength - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
