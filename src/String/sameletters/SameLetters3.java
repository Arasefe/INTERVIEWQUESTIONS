package String.sameletters;

import java.util.Arrays;

/*
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
public class SameLetters3 {
    public static void main(String[] args) {
        sameLetters1("Aras","sara");
        sameLetters1("Tulpar","putlar");
    }
    public static void sameLetters1(String str1, String str2){
        char []ch1=str1.toLowerCase().toCharArray();
        char []ch2=str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String word1="";
        for(char each:ch1){
            word1+=each;
        }
        String word2="";
        for(char each:ch2){
            word2+=each;
        }
        System.out.println(word1.equals(word2));
    }
}
