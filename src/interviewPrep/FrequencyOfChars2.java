package interviewPrep;

import java.util.*;

public class FrequencyOfChars2 {
    /*
    Write a method that prints the frequency of each character from a String
     */
    public static void main(String[] args) {
        frequencyOfChars("Ali came to school, and Ayse said \"Welcome to school Ali\"");

    }

    public static void frequencyOfChars(String str) {
        String words[] = str.split(" ");
        List<String>wordsList=new LinkedList<>();
        for (String word : words) {
            wordsList.add(word.replaceAll("\\W", ""));
        }

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : wordsList) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
