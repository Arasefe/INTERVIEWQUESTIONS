package collectionsPackage.MapInterface;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample1 {
    public static void main(String[] args) {
        method();
        //method2();
    }
    public static void method(){
        Map<String, LocalDate>students=new TreeMap<>();
        students.put("Aras",LocalDate.of(1999,4,12));
        students.put("Tulpar",LocalDate.of(1978,3,2));
        students.put("Efe",LocalDate.of(1989,12,19));
        students.put("Ege",LocalDate.of(1991,8,29));
        System.out.println(students);
        for (String each : students.keySet()) {
            Object value=students.get(each);
            System.out.println(each+" : "+value);
        }

    }

    public static void method2(){
        Map<String,Integer> map=new HashMap<>();
        map.put("Chicago",50000);
        map.put("DC",60000);
        map.put("AL",70000);
        System.out.println(map.get("AL"));
        for (String s : map.keySet()) {
            Object eachValue=map.get(s);
            System.out.println(eachValue);
        }
    }
}
