package mentoringInterviewPackage.interviewSet_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        System.out.println(anagram("level"));
        System.out.println(anagram("Aras"));
        System.out.println(anagram("ara"));
    }

    public static boolean anagram(String str){
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        String reverse="";
        for(int i=list.size()-1;i>=0;i--){
            reverse+=list.get(i);
        }
        return reverse.equals(str);


    }
}
