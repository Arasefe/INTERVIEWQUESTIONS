package collectionsPackage.MapInterface;

import java.util.*;

public class MapExample4 {
    public static void main(String[] args) {
        method("aaaabbbaabcccb");
        method2("aaaabbbaabcccbf");
    }

    public static void method(String str){
        Map<String,Integer>map=new LinkedHashMap<>();
        List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        for (String each : list) {
            int frequency=Collections.frequency(list,each);
            map.put(each,frequency);
        }
        System.out.println(map);
    }


    public static void method2(String str){
        Map<String,Integer>map=new LinkedHashMap<>();
        List<String>list=Arrays.asList(str.split(""));

        for (String each : list) {
            if(Collections.frequency(list,each)==1){
                map.put(each,1);
            }
        }
        System.out.println(map);
    }
}
