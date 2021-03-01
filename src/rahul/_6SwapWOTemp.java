package rahul;

public class _6SwapWOTemp {
    public static void main(String[] args) {
        swapWOTemp1(3,5);
        swapWOTemp2(3,5);
        swapWOTemp3(3,5);
        swapWOTemp4(3,5);
    }
    public static void swapWOTemp1(int x, int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping: x = "+x +", y = "+y);
    }

    public static void swapWOTemp2(int x, int y){
        x = x * y; // x now becomes 15
        y = x / y; // y becomes 3
        x = x / y; // x becomes 5

        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
    }

    public static void swapWOTemp3(int x,int y){
        // Code to swap 'x' (0011) and 'y' (0101)
        x = x ^ y; // x now becomes 7 (0111)
        y = x ^ y; // y becomes 7 (0111)
        x = x ^ y; // x becomes 5 (0101)
        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);

    }

    public static void swapWOTemp4(int a, int b){
        // same as a = a + b
        a = (a & b) + (a | b);

        // same as b = a - b
        b = a + (~b) + 1;

        // same as a = a - b
        a = a + (~b) + 1;

        System.out.print("After swapping: a = " + a
                + ", b = " + b);
    }

}
