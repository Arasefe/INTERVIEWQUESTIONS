package cybertek_interviewPrep;

public class SwapNumbers {
    public static void main(String[] args) {
        swapNumbers1(3,5);
        swapNumbers2(4,6);
    }
    public static void swapNumbers1(int a, int b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void swapNumbers2(int a, int b){          // 3    5
        System.out.println("a = " + a+" b = "+b);
        a=a+b;                                              // a=8
        b=a-b;                                              // b=3
        a=a-b;                                              // a=5
        System.out.println("a = " + a+" b = "+b);
    }

}
