package PrimitiveDataTypes;

public class SwapTwoVariables {


    public static void main(String[] args) {
        swapMethod(4,5);
    }

    public static void swapMethod(int a,int b){
//        int a=4;
//        int b=3;
        int temp=a;         //4
        a=b;                //3
        b=temp;             //4
        System.out.println("a is " +a);
        System.out.println("b is " +b);
    }

    public static void swapMethod2(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}
