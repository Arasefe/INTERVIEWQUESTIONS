package cybertek_interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _5FindTheUnique {
    public static void main(String[] args) {
        //findTheUnique1("AAABBBCCCDEF");
        //String str=findTheUnique2("JDASDAKSDAHAD");
        //findTheUnique1("dkdanaksdaksd");
        findTheUnique4("asasaasce");



    }
    public static void findTheUnique1(String str){
        String uniques="";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)) count++;
            }
            if(count==1){
                uniques+=str.charAt(i);
            }
        }
        System.out.println(uniques);
    }

    public static  String findTheUnique2(String str){
        String uniques="";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)) count++;
            }
            if(count==1) uniques+=str.charAt(i);
        }

        return uniques;
    }

    public static void findTheUnique3(String str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);
        String unique="";
        for (int i = 0; i < list.size(); i++) {
            int fr= Collections.frequency(list, str.charAt(i)+"");
            if(fr==1) unique+=str.charAt(i);
        }

        System.out.println(unique);
    }

    public static void findTheUnique4(String str){
        String unique="";
        String[]arr=str.split("");
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].equals(arr[i])){
                    count++;
                }
            }
            if(count==1){
                unique+=arr[i];
            }
        }
        System.out.println(unique);
    }

}
