package interviewPrep;

import java.util.*;

public class FindTheUnique {
    public static void main(String[] args) {
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

    public static void findTheUnique5(String str) {
        Map<Character, Integer> unique = new HashMap<>();

        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count == 1) {
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);

    }

    public static void findTheUnique6(String str){
        //Map -- Unique character from String
        Character[]characters=new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i]=str.charAt(i);
        }
        ArrayList<Character>list=new ArrayList<Character>(Arrays.asList(characters));
        Map<Character, Integer> unique = new LinkedHashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int count=Collections.frequency(list,list.get(i));
            if(count==1) unique.put(list.get(i),count);
        }
        System.out.println(unique);

    }

}
