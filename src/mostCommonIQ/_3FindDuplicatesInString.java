package mostCommonIQ;

import java.util.HashMap;
import java.util.Set;

public class _3FindDuplicatesInString {
    public static void main(String[] args) {
        duplicateCharCount("JavaJ2EE");
        duplicateCharCount("Fresh Fish");
        duplicateCharCount("Better Butter");
    }


    public static void duplicateCharCount(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //Converting given string to char array
        char[] strArray = str.toCharArray();
        //checking each char of strArray
        for (char c : strArray) {
            if (map.containsKey(c)) {
                //If char is present in charCountMap, incrementing it's count by 1
                map.put(c, map.get(c) + 1);
            } else {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                map.put(c, 1);
            }
        }

        //Getting a Set containing all keys of charCountMap
        Set<Character> charsInString = map.keySet();
        System.out.println("Duplicate Characters In " + str);
        //Iterating through Set 'charsInString'
        for (Character ch : charsInString) {
            if (map.get(ch) > 1) {
                //If any char has a count of more than 1, printing it's count
                System.out.println(ch + " : " + map.get(ch));
            }
        }
    }
}
