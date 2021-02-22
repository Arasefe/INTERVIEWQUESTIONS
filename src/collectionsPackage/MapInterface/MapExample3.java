package collectionsPackage.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample3 {

    public static void main(String[] args) {
        method();
    }

    public static void method(){
        Map<String, String> countries=new LinkedHashMap<>();
        countries.put("Turkiye","Ankara");
        countries.put("USA","Washington");
        countries.put("China","Pekin");
        countries.put("Azerbaican","Baku");
        countries.put("Belarus","Minsk");

        //System.out.println(country:capital);

        for (String eachKey : countries.keySet()) {
            String eachValue = countries.get(eachKey);
            System.out.println(eachKey+":"+eachValue);
        }
    }
}
