package interviewPrep;

import java.util.*;

public class FrequencyOfChars2 {
    /*
    Write a method that prints the frequency of each character from a String
     */
    public static void main(String[] args) {
        //frequencyOfChars1("Ali came to school, and Ayse said \"Welcome to school Ali\"");
        frequencyOfChars2("Ali came to school, and Ayse said \"Welcome to school Ali\"");


    }

    public static void frequencyOfChars1(String str) {
        String words[] = str.split(" ");
        List<String>wordsList=new LinkedList<>();
        for (String word : words) {
            wordsList.add(word.replaceAll("\\W", ""));
        }

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : wordsList) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }

    private static void frequencyOfChars2(String str){
        List<String>list=new LinkedList<>(Arrays.asList(str.replaceAll("\\p{Punct}","").split(" ")));
        System.out.println(list);
        Map<String, Integer>map=new LinkedHashMap<>();

        for (String each : list) {
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }
        System.out.println(map);

    }

    public static void stringFrequency1(String str) {
        str=str.replaceAll("\\p{Punct}"," ");
        HashMap<String, Integer> map = new LinkedHashMap<>();
        String[] arr = str.split(" ");
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
