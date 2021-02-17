package ro;

public class _6SwapWOTemp {
    public static void main(String[] args) {
        swapWOTemp(3,5);
    }
    public static void swapWOTemp(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a +" and b is "+b);
    }
}
