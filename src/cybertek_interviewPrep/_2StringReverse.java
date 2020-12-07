package cybertek_interviewPrep;

import java.util.Arrays;

public class _2StringReverse {
    public static void main(String[] args) {
        //reverseString("Aras");
        reverseString2("Tulpar is one of my sons");
        reverseString2("Tulpar is one of my sons");
        reverseString2("Tulpar is one of my sons");

    }

    public static void reverseString(String str){
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){
            reverse+=" "+str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void reverseString1(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void reverseString2(String str){
        String[]strArray=str.split(" ");
        String reverse="";
        for(int i= strArray.length-1;i>=0;i--){
            reverse+=" "+strArray[i];
        }
        System.out.println(reverse);
    }

    public static void reverseString3(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void reverseString4(String str){

        String[]arr=str.split(" ");
        String[]reverseArr=new String[arr.length];
        System.out.println(Arrays.toString(arr));
        int k=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            reverseArr[k]=arr[i];
            k++;
        }
        System.out.println(Arrays.toString(reverseArr));
    }

    public static String reverseString5(String str){                  // Islam
        if(str.isEmpty()){
            return str;
        }

        return reverseString5((str).substring(1)) + str.charAt(0);    // slam+I--lamI
    }

    public static void reverseString6(String str){
        StringBuilder sb=new StringBuilder(str);
        StringBuffer b=new StringBuffer(str);

//        sb.reverse();
//        System.out.println(sb);
        b.reverse();
        System.out.println(b);
    }


    public static void reverseString7(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=""+str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String reverseString8(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }

        return reverse;
    }

    public static void reverseString9(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void reverseString10(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

    }

    public static StringBuffer reverseString11(String str){
        return new StringBuffer(str).reverse();
    }

    public static void reverseString12(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }

    public static void reverseString13(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void reverseString14(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void reverseString15(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }

}
