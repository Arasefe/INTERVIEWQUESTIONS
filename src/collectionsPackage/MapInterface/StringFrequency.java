package collectionsPackage.MapInterface;

import java.util.*;

public class StringFrequency {
    public static void main(String[] args) {
        //method1("efemmm");
        //method2("efemmm");
        //method3("efemmm");
        //method4("efelerrrr");
        method5("efelerim");
    }

    public static void method1(String str) {
        List<String> list = new LinkedList<>(Arrays.asList(str.split("")));

        String nunDup="";
        for (int i = 0; i < list.size(); i++) {
            if(!nunDup.contains(list.get(i))){
                nunDup+=list.get(i);
            }
        }
        System.out.println(nunDup);
        String result = "";
        for (int i=0;i<nunDup.split("").length;i++) {
            int fr = Collections.frequency(list, nunDup.split("")[i]);
            result += nunDup.charAt(i)+""+fr;
        }
        System.out.println(result);
    }


    public static void method2(String inputString) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char each : strArray) {
            if (charMap.containsKey(each)) {
                charMap.put(each, charMap.get(each) + 1);
            } else {
                charMap.put(each, 1);
            }
        }
        System.out.println(charMap);
        //{s=3, c=1, d=3, f=3, v=1, g=2, h=2, j=1, k=3, l=2}


    }

    public static void method3(String str){
        HashMap<String, Integer>map=new HashMap<>();
        String[]arr=str.split("");
        for (String each : arr) {
            if (map.containsKey(each)) {
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }
        System.out.println(map);
    }

    public static void method4(String str){
        HashMap<String, Integer>map=new LinkedHashMap<>();
        String[]arr=str.split("");
        for (String each : arr) {
            if (!map.containsKey(each)) {
                map.put(each,1);
            }else if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }
        }
        System.out.println(map);
    }


    public static void method5(String str){
        HashMap<String, Integer>map=new LinkedHashMap<>();
        String[]array=str.split("");            // [e,f,e,l,e,r,i,m]
        for (String unique : array) {
            if(!map.containsKey(unique)){
                map.put(unique,1);
            }else if(map.containsKey(unique)){
                map.put(unique,map.get(unique)+1);
            }
        }
        System.out.println(map);
    }

}