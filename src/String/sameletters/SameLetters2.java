package String.sameletters;

import java.util.Arrays;

public class SameLetters2 {
    public static void main(String[] args) {
        boolean result=isSameLetters("Tulpar","PUTLAR");
        System.out.println(result);

    }
    public static boolean isSameLetters(String a, String b){
        char[]ch1=a.toLowerCase().toCharArray();
        char[]ch2=b.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str1="";
        for(char each:ch1){
            str1+=each;
        }

        String str2="";
        for(char each:ch2){
            str2+=each;
        }


        return str1.equals(str2);
    }
}
