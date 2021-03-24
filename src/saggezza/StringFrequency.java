package saggezza;

import java.util.*;

public class StringFrequency {
    public static void main(String[] args) {
        stringFrequency2("jsdjdchjasl");
    }

    public static void stringFrequency1(String str) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        String[] arr = str.split("");
        for (String each : arr) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            }
        }
        System.out.println(map);
    }

    public static void stringFrequency2(String str) {
        List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        Set<String>uniques=new LinkedHashSet<>(list);
        String result="";
        for (String each : uniques) {
            int fr=Collections.frequency(list,each);
            result+=each+"="+fr+" ";
        }
        System.out.println(result);
    }

}
