package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FindTheRepeated {
    public static void main(String[] args) {
        findRepeated("Arasefe");
    }

    public static void findRepeated(String s) {

        String arr[] = s.split("");

        Map<String, Integer> map = new HashMap<>();

        for (String w : arr) {
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }

        for (Map.Entry<String, Integer> w : map.entrySet()) {
            if (w.getValue() > 1) {
                System.out.println(w.getKey() + " = " + w.getValue());
            }
        }
    }
}
