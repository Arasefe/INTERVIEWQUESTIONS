package interviewPrep;

import java.util.*;

public class _33SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Z", 1456);
        map.put("D", 25);
        map.put("F", 30);
        sortMap(map);
        System.out.println(sortMap(map));
    }

    public static List<Integer> sortMap(Map<String, Integer> map) {
        List<Integer> list = new ArrayList<>();

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            //System.out.println(each.getKey() + " : "+each.getValue());
            list.add(each.getValue());

        }
        Collections.sort(list);
        return list;
    }
}
