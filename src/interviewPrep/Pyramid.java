package interviewPrep;

public class Pyramid {

    /*
          Ask user to enter the number of lines of a pyramid.
          Type a program to create the pyramid.
          For example if the number of lines is 5, the pyramid will be like;         *
                                                                                  * * *
                                                                                * * * * *
                                                                              * * * * * * *
                                                                            * * * * * * * * *
    */
    public static void main(String[] args) {
        pyramid();
    }

    private static void pyramid() {
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; i++, k = 0) {

            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
        }
    }


    private static void invertedPyramid(){
        /*
	  	Ask user to enter the number of lines of an inverted pyramid.
	  	Type a program to create the inverted pyramid.
  	    For example; if the number of lines is 5, the pyramid will be like; * * * * * * * * *
																			  * * * * * * *
																			    * * * * *
																			      * * *
																			        *
    */
        int rows = 5;

        for(int i = rows; i > 0; --i) {

            for(int space = 0; space < rows - i; space++) {
                System.out.print("  ");
            }

            for(int j=0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
