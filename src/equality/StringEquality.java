package equality;

public class StringEquality {
    public static void main(String[] args) {
        String a="hello";
        String b="hello";
        String c=new String("hello");
        String d=new String("hello");

        System.out.println(a==b);   //true
        System.out.println(c==d);   //false
        System.out.println(a==d);   //false
        System.out.println(a.equals(d));   //true
        System.out.println(a.equals(b));   //true


    }
}
