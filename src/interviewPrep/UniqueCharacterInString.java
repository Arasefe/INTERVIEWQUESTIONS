package interviewPrep;

import java.util.*;

public class UniqueCharacterInString {
    //Map -- Unique character from String

    public static void main(String[] args) {
        uniqueCharInString3("CHSUSHUFHFJKLV");
    }

    public static void uniqueCharInString(String str) {
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

    public static void uniqueCharInString2(String str){

    }


    public static void uniqueCharInString3(String str){
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
