package mentoring.interviewSet_1;

import java.util.*;

public class FrequencyOfLetters {
    //5.Write a method which returns how many times each letter is repeated?

    public static void main(String[] args) {
        frequency1("asjbdsjakds");
        frequency2("asjbdsjakds");
        frequency3("asjbdsjakds");
    }



    public static void frequency1(String str){
        String nonDup="";
        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains(str.charAt(i)+"")){
                nonDup+=str.charAt(i);
            }
        }
        String result="";
        for (int i = 0; i < nonDup.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            result+=""+nonDup.charAt(i)+count;
        }
        System.out.println(result);
    }


    public static void frequency2(String str){
        List<String>wordsList=new ArrayList<>(Arrays.asList(str.split("")));
        Set<String>uniques=new HashSet<>(Arrays.asList(str.split("")));
        String result="";
        for (String each:uniques ) {
            int fr=Collections.frequency(wordsList,each);
            result+=each+"= "+fr;
        }
        System.out.println(result);

    }

    public static void frequency3(String str){

        Map<String, Integer>map=new HashMap<>();
        Set<String>uniques=new HashSet<>(Arrays.asList(str.split("")));

        for (String each: uniques) {
            if(!map.containsKey(each)){
                map.put(each,1);
            }else if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }
        }
        System.out.println(map);
    }

}
