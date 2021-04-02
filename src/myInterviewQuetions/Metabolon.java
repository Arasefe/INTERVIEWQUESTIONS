package myInterviewQuetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Metabolon {

    public static void main(String[] args) {
        char[]chars=new char[]{'B','B','*','C','$','D','#','E','!','F'};
        reverse2("AB*C$D#E!F");
    }
    public static void reverse(String str){
        //AB*C$D#E!F
        String reverse="";
        for (int i= str.length()-1;i>=0; i--) {
            //String alpha=""+str.charAt(i);

            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){

                reverse+=str.charAt(i);
            }else{

            }
        }
        System.out.println(reverse);

    }

    public static void reverse2(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(list);
        List<String> reversed;

        for (int i = list.size(); i >= 0; i--) {

        }
    }

        public static void reverse3(char[]chars){
            char temp='A';
            for (int i=chars.length-1;i>=0; i--) {
                
            }

    }



}
