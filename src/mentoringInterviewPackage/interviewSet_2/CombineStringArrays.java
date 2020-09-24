package mentoringInterviewPackage.interviewSet_2;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineStringArrays {
    // Combine two String arrays into one arraylist and return it as a string.
    // EX:combineRs(["f","o","o"],[" b","a","r"]) --->  "foo bar"

    public static void main(String[] args) {
        String result=combineStringArrays(new String[]{"f","o","o"},new String[]{" b","a","r"});
        System.out.println(result);

    }

    public static String combineStringArrays(String[]array1, String[]array2){

        String[]combinedArray=new String[array1.length+ array2.length];
        int i=0;
        for(String each:array1){
            combinedArray[i]=each;
            i++;
        }
        int j= array1.length;
        for(String each:array2){
            combinedArray[j]=each;
            j++;
        }
        System.out.println(Arrays.toString(combinedArray));
        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList(combinedArray));


        String str="";
        for(String each:list){
            str+=each;
        }
        return str;
    }

}
