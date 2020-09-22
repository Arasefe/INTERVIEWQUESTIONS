package String.sameletters;

import java.util.Arrays;

/*
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
public class SameLetters4 {
    public static void main(String[] args) {
        boolean result=sameLetters("Aras","Tulpar");
        System.out.println(result);
        boolean result1=sameLetters("Aras","sara");
        System.out.println(result1);
    }

    public static boolean sameLetters(String str1, String str2){
        char[]ch1=str1.toLowerCase().toCharArray();
        char[]ch2=str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }
}
