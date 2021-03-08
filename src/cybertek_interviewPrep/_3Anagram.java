package cybertek_interviewPrep;

import java.util.Arrays;
import java.util.TreeSet;

/*
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
public class _3Anagram {
    public static void main(String[] args) {

        boolean result = anagram1("Aras", "Sara");
        System.out.println(result);
        anagram5("aras","sara");
    }

    public static boolean anagram1(String str1, String str2) {
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String first = "";
        for (char each : ch1) {
            first += each;
        }
        String second = "";
        for (char each : ch2) {
            second += each;
        }
        return first.equals(second);
    }

    public static boolean anagram2(String a, String b){
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

    public static void anagram3(String str1, String str2){
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

    public static boolean sameLetters4(String str1, String str2){
        char[]ch1=str1.toLowerCase().toCharArray();
        char[]ch2=str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    public static boolean sameLetters5(String str1, String str2){
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


    public static void anagram4(String str1,String str2){
        str1=new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2=new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2));
    }


    public static void anagram5(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            str2=str2.replaceFirst(""+str1.charAt(i),"");
        }
        System.out.println(str2.isEmpty()?"Anagram":"Not");
    }




















}
