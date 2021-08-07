package techproed.InterviewSet_Set1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pangram {
    /*
    Write a function to check whether a string is pangram or not assuming that the string passed in
    does not have any punctuation. Pangrams are words or sentences containing every letter of the
    alphabet at least once. EX: The quick brown fox jumps over the lazy dog --> true
     */
    public static void main(String[] args) {

    }

    private static boolean isPangram(String str){
        str = str.replace(" ", "").toUpperCase();
        String[] arr = str.split("");
        List<String> list = Arrays.asList(arr);
        HashSet<String> set = new HashSet<>(list);
        return set.size() == 26;
    }

    private static boolean isPangram2(String str){
        str = str.replace(" ", "").toUpperCase();
        ArrayList<Character> al = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            char each = str.charAt(i);
            //if(!al.contains(each) && each >= 65 && each <= 90){
            //if(!al.contains(each) && each >= 'A' && each <= 'Z'){
            if(!al.contains(each) && Character.isLetter(each)){
                al.add(each);
            }
        }
        return al.size() == 26;
    }
}
