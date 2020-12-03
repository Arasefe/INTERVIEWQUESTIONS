package cybertek_interviewPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class _32MapMinValue {
    public static void main(String[] args) {

        minValue2();

    }

    public static int minValue1(Map<String, Integer> map) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first();

    }

    public static void minValue2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("v", 8);
        map.put("z", 1);

        System.out.println("map = " + map);

        SortedSet<Integer> set = new TreeSet<>(map.values());

        System.out.println("minValue(map) = " + set.first());


    }

    public static int minValue3(Map<String, Integer> map) {

        SortedSet<Integer> set = new TreeSet<>(map.values());

        return set.first();

    }
}
