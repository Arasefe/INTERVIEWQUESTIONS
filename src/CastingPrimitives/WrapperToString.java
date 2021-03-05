package CastingPrimitives;

public class WrapperToString {
    public static void main(String[] args) {
        byte b=127;
        String sb=Byte.toString(b);
        System.out.println(sb);

        short s= 13;
        String ss=Short.toString(s);
        System.out.println(ss);

        int i=2380;
        String si=Integer.toString(i);
        System.out.println(si);

        long l=1232399329;
        String ls=Long.toString(l);
        System.out.println(ls);

        float f=1212.343f;
        String sf=Float.toString(f);
        System.out.println(sf);

        double d=23892947.89;
        String sd=Double.toString(d);
        System.out.println(sd);




    }


}
