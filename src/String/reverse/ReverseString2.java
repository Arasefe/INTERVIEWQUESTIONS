package String.reverse;

public class ReverseString2 {
    public static void main(String[] args) {
        reverseStringBuffer("Aras");
        StringBuffer sb=reverse("Tulpar");
        System.out.println(sb.toString());

        reverseStringBuilder("Banu");




    }
    public static void reverseStringBuffer(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

    }

    public static StringBuffer reverse(String str){
        return new StringBuffer(str).reverse();
    }

    public static void reverseStringBuilder(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }

}
