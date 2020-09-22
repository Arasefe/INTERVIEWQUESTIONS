package String.reverse;

public class ReverseString3 {
    public static void main(String[] args) {
        String str="jhsdhjsds";
        reverseString(str);

    }
    public static void reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void reverseString2(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
