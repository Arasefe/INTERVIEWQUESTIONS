package ro;

public class _2MultiplyWOM {
    public static void main(String[] args) {
        //multiplyWOM(5);
        //multiplyWOM2(3,117);
        multiplyWOM3();
    }

    public static void multiplyWOM(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }

    public static void multiplyWOM2(int a, int b) {
        int result=0;
        for (int i = 1; i <= b; i++) {
             result+= a;
        }

        System.out.println(a+"*"+b+"="+result);
    }

    public static void multiplyWOM3(){
        int sum=0;
        String display="";
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                sum+=j;
                display=i+"*"+j+"="+sum;
                System.out.println(display);
            }
        }

    }
}
