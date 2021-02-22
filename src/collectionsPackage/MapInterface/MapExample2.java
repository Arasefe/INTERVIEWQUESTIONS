package collectionsPackage.MapInterface;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample2 {

    public static void main(String[] args) {
        method();
        //method2();
    }
    public static void method(){
        Map<String, Integer>students=new LinkedHashMap<>();
        students.put("Aras",98);
        students.put("Tulpar",87);
        students.put("Efe",67);
        students.put("Ege",60);
        students.put("Banu",90);
        students.put("Ismail",80);
        //System.out.println(students);
        LinkedHashMap<String, Integer>earlyBirds=new LinkedHashMap<>();
        LinkedHashMap<String, Integer>angryBirds=new LinkedHashMap<>();

        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
            if (eachValue> 85) {
                earlyBirds.put(eachKey,eachValue);
            }else{
                angryBirds.put(eachKey,eachValue);
            }
        }
        System.out.println("Early Birds"+earlyBirds);
        System.out.println("Angry Birds"+angryBirds);
    }
}
