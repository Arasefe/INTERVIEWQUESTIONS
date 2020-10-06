package cybertek_interviewPrep;

import java.util.Arrays;

public class ReverseString_Sentence {
    public static void main(String[] args) {
        //reverse1("The more you study the better you will be!");
        //reverse2("The more you study the better you will be!");
        System.out.println(reverse3("Islam"));
        reverse4("Katerina");
    }
    public static void reverse1(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void reverse2(String str){

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

    public static String reverse3(String str){                  // Islam
        if(str.isEmpty()){
            return str;
        }

        return reverse3((str).substring(1)) + str.charAt(0);    // slam+I--lamI
    }

    public static void reverse4(String str){
        StringBuilder sb=new StringBuilder(str);
        StringBuffer b=new StringBuffer(str);

//        sb.reverse();
//        System.out.println(sb);
        b.reverse();
        System.out.println(b);
    }
}
