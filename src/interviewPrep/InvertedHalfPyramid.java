package interviewPrep;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        invertedHalfPyramid(5);
        invertedHalfPyramid();
    }

    private static void invertedHalfPyramid(int rows){


        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private static void invertedHalfPyramid(){
        int rows = 5;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
