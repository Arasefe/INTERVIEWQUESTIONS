package CastingPrimitives;

public class FloatToString {
    public static void main(String[] args) {
        float f=1212.343f;
        String sf=Float.toString(f);
        System.out.println(sf);

        int i=2380;
        String si=Integer.toString(i);
        System.out.println(si);

        byte b=127;
        String sb=Byte.toString(b);
        System.out.println(sb);

        swapMethodWOO();
    }

    public static void swapMethodWOO(){
        int a=3;
        int b=5;
        System.out.println("a= "+a+" and b="+b);
        a = a ^a ^ (b = a);
        b = (a + b)-(a = b); a += b-(b = a);
        System.out.println("a= "+a+" and b="+b);


    }
}
