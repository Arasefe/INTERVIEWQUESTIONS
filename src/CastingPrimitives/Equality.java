package CastingPrimitives;

public class Equality {
    public static void main(String[] args) {
        int a=3,b=4;
        int c=3;
        String str="Ali";
        String str1=new String("Ali");
        String str2=new String("Ali");
        System.out.println(a==c);                   // true
        System.out.println(str==str1);              // false
        System.out.println(str1==str2);             // false
        System.out.println(str1.equals(str2));      // true

    }
}
