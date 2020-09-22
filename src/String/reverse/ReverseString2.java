package String.reverse;

public class ReverseString2 {
    public static void main(String[] args) {
        reverse1("Aras");
        StringBuffer sb=reverse2("Tulpar");
        System.out.println(sb.toString());

        reverseStringBuilder("Banu");

        reverse3("Ismail");




    }
    public static void reverse1(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

    }

    public static StringBuffer reverse2(String str){
        return new StringBuffer(str).reverse();
    }

    public static void reverseStringBuilder(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }

    public static void reverse3(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

}
