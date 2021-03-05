package mentoring.interviewSet_1;

public class SwapTwoVariables {
    //1.Swap two variables' values without using temp variable.

    public static void main(String[] args) {
        swapNumbers(3,5);

    }


    public static void swapNumbers(int x,int y) {

        System.out.println("Before implementation " + x + "..." + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After without Temp " + x + "..." + y);

    }


}
