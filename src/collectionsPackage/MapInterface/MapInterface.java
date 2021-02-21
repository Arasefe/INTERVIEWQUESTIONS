package collectionsPackage.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapInterface {
    public static void main(String[] args) {
       // method();
        method2();
    }
    public static void method(){
        Set<Integer>set=new TreeSet<>();
        Set<Integer>set1=new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
        System.out.println(set);
        for (int i = 100; i >= 1; i--) {
            set1.add(i);
        }
        System.out.println(set1);

    }

    public static void method2(){
        Map<String,Integer> map=new HashMap<>();
        map.put("Chicago",50000);
        map.put("DC",60000);
        map.put("AL",70000);
        System.out.println(map.get("AL"));
//        for (String s : map.keySet()) {
//            Object eachValue=map.get(s);
//            System.out.println(eachValue);
//        }
//


    }
}
