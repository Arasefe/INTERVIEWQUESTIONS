package collectionsPackage.MapInterface;

import java.util.*;

public class FrequencyExample2 {
    public static void main(String[] args) {
        //charFrequency1("Efelerimm");
        charFrequency2("Efelerimm");

    }

    public static void charFrequency1(String str){
        char[]arr=str.toCharArray();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for (char c : arr) {
            if(!map.containsKey(c)){
                map.put(c,1);
            }else if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
        }
        System.out.println(map);
    }

    public static void charFrequency2(String str){
        List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        Set<String>uniques=new HashSet<>(list);
        String result="";
        for (String unique : uniques) {
            int frequency=Collections.frequency(list,unique);
            result+=unique+"="+frequency+" ";
        }
        System.out.println(result);
    }

    public static void charFrequency3(String str){
        List<String>list=new LinkedList<>(Arrays.asList(str.split("")));
        Set<String>uniques=new HashSet<>();
        for (String each : str.split("")) {
            if(!uniques.contains(each)){
                uniques.add(each);
            }
        }
        String result="";
        for (String unique : uniques) {
            int fr=Collections.frequency(list,unique);
            result+=unique+"="+fr+" ";
        }
        System.out.println(result);
    }
}
