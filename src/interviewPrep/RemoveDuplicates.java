package interviewPrep;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String result=removeDuplicates1("missing");
        System.out.println(result);

//        removeDuplicates2("missing");
//        removeDuplicates3("missing");
        removeDuplicates4("missing");


    }
    public static String removeDuplicates1(String str){
        String nonDup="";
        for(int i=0;i<str.length();i++){
            if(!nonDup.contains(str.charAt(i)+"")){
                nonDup+=str.charAt(i);
            }
        }
        return nonDup;
    }

    public static void removeDuplicates2(String str){
        String nonDup="";
        for(int i=0;i<str.length();i++){
            if(!nonDup.contains(str.charAt(i)+"")) nonDup+=str.charAt(i);
        }
        System.out.println(nonDup);
    }

    public static void removeDuplicates3(String str){
        String nonDup="";
        for(int i=0;i<str.length();i++){
            if(nonDup.contains(str.charAt(i)+"")){
                continue;
            }else{
                nonDup+=str.charAt(i);
            }
        }
        System.out.println(nonDup);

    }

    public static void removeDuplicates4(String str){
        Set<String>uniques=new LinkedHashSet<>(Arrays.asList(str.split("")));
        System.out.println(uniques);
    }
}
