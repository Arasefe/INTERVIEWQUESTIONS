package interviewPrep;

public class ReverseString {
    public static void main(String[] args) {
        reverse1("Aras");
        reverse3("Aras Tulpar");



    }
    public static void reverse1(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=""+str.charAt(i);
        }
        System.out.println(reverse);
    }


    public static void reverse2(String str){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }

    public static void reverse3(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    public static void reverse4(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }

}
