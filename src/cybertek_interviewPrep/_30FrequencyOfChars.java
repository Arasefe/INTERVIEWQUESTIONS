package cybertek_interviewPrep;

import java.util.LinkedHashMap;
import java.util.Map;

public class _30FrequencyOfChars {
    /*
    Write a method that prints the frequency of each character from a String
     */
    public static void main(String[] args) {
        frequencyOfChars("Arasefemm");

    }

    public static void frequencyOfChars(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
