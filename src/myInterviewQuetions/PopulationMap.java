package myInterviewQuetions;


import java.util.HashMap;
import java.util.Map;

public class PopulationMap {
    public static void main(String[] args) {
        Map<String,Integer>cities=new HashMap<>();
        cities.put("Chicago",50000);
        cities.put("LA",60000);
        cities.put("SFO",70000);

        System.out.println(cities.get("SFO"));
        System.out.println(cities.get(1));
        whatIsWrong();

    }
    public static void whatIsWrong(){
        Map<String,Object>cities=new HashMap<>();
        cities.put("Chicago",50000);
        cities.put("LA",60000);
        cities.put("SFO",70000);

        System.out.println(cities.get("SFO"));
        for (String s : cities.keySet()) {
            Object eachValue=cities.get(s);
            System.out.println(s+" : "+eachValue);
        }
    }


}
