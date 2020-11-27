package mentoringInterviewPackage.interviewSet_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram3 {
    public static void main(String[] args) {
        System.out.println(anagram1("ara"));
    }

    public static boolean anagram1(String str){
        String[]strArray=str.split("");
        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(strArray));
        Collections.reverse(list);
//        System.out.println(list);
        String reverse=list.toString();
            return str.equals(reverse);
        }
    }

