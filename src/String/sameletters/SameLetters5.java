package String.sameletters;

import java.util.Arrays;

/*
Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
 */
public class SameLetters5 {
    public static void main(String[] args) {
        boolean r=sameLetters("Aras","sara");
        System.out.println(r);
    }

    public static boolean sameLetters(String str1, String str2){
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String newStr1="";
        for(char each:ch1){
            newStr1+=each;
        }


        String newStr2="";
        for(char each:ch2){
            newStr2+=each;
        }


        return newStr1.equals(newStr2);


    }
}
