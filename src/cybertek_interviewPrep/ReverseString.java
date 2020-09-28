package cybertek_interviewPrep;

public class ReverseString {
    public static void main(String[] args) {
        reverse1("Aras");
        String a=reverse2("Tulpar");
        System.out.println(a);
        reverse3("Aras Tulpar");



    }
    public static void reverse1(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=""+str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String reverse2(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }

        return reverse;
    }

    public static void reverse3(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void reverse4(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

    }

    public static StringBuffer reverse5(String str){
        return new StringBuffer(str).reverse();
    }

    public static void reverseStringBuilder(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }

    public static void reverse6(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
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
