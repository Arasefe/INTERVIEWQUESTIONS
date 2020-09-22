package String.frequencyofchars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        frequencyOfChars("AADDJSDDSFSFFMS");
    }
    public static void frequencyOfChars(String str){
        String nonDup="";
        for(int i=0;i<str.length();i++){
            if(!nonDup.contains(str.charAt(i)+"")) nonDup+=str.charAt(i);
        }

        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        String result="";
        for(int i=0;i<nonDup.length();i++){
            int count=Collections.frequency(list,list.get(i));
            result+=nonDup.charAt(i)+""+count;
        }
        System.out.println(result);
    }
}
