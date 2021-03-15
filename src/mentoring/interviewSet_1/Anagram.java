package mentoring.interviewSet_1;
//Write a method where u check to see if the word u pass is Anagram

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args) {
        //System.out.println(anagram1("level"));
        System.out.println(anagram2("ara"));
    }

    public static boolean anagram1(String str) {
        String[] word = str.split("");

        String reverse = "";
        for (int i = word.length-1; i >= 0; i--) {
            reverse += word[i];
        }
        if (str.equals(reverse)) return true;
        else {
            return false;
        }
    }

    public static boolean anagram2(String str){
        char[]c=str.toCharArray();

        String reverse="";
        for(int i=c.length-1;i>=0;i--){
            reverse+=c[i];
        }
        if(str.equals(reverse)) return true;
        else{
            return false;
        }

    }

    public static boolean anagram3(String str){
        ArrayList<String> list=new ArrayList<>(Arrays.asList(str.split("")));
        String reverse="";
        for(int i=list.size()-1;i>=0;i--){
            reverse+=list.get(i);
        }
        return reverse.equals(str);


    }

    public static boolean anagram4(String str){
        String[]strArray=str.split("");
        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(strArray));
        Collections.reverse(list);
//        System.out.println(list);
        String reverse=list.toString();
        return str.equals(reverse);
    }

}
