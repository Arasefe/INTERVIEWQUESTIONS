package interviewPrep;

public class SwapNumbers {
    public static void main(String[] args) {
        swapNumbers1(3,5);
        swapNumbers2(3,5);
        swapNumbers3(3,5);
        swapNumbers4(3,5);
    }
    public static void swapNumbers1(int a, int b){
        System.out.println("Before swapping: a = " + a+" b: "+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a = " + a+" b: "+b);

    }

    public static void swapNumbers2(int a, int b){
        System.out.println("Before swapping: a = " + a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a+" b: "+b);
    }

    public static void swapNumbers3(int a, int b){
        System.out.println("Before swapping: a = " + a+" b: "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swapping: a = " + a+" b: "+b);
    }

    public static void swapNumbers4(int a, int b){
        System.out.println("Before swapping: a = " + a+" b: "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: a = " + a+" b: "+b);
    }

}
