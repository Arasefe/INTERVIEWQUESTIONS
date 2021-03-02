package collectionsPackage.MapInterface;

import java.util.*;

public class CharFrequency {
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
}
