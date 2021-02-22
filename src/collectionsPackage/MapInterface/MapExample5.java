package collectionsPackage.MapInterface;

import java.time.LocalDate;
import java.util.*;

public class MapExample5 {
    public static void main(String[] args) {
        //method();
        method2();
    }
    public static void method(){
        Map<String, LocalDate> students=new TreeMap<>();
        students.put("Aras",LocalDate.of(1999,4,12));
        students.put("Tulpar",LocalDate.of(1978,3,2));
        students.put("Efe",LocalDate.of(1989,12,19));
        students.put("Ege",LocalDate.of(1991,8,29));
        // Store all the names to List
        List<String>names=new ArrayList<>(students.keySet());
        System.out.println(names);

        for (LocalDate value : students.values()) {
            System.out.println(value);
        }

        List<LocalDate>DOB=new ArrayList<>(students.values());
        for (LocalDate localDate : DOB) {
            System.out.println(localDate);

        }
        System.out.println("=============================================");
        for (Map.Entry<String, LocalDate> entrySet : students.entrySet()) {
            System.out.println(entrySet);
        }
    }
    public static void method2(){
        Map<String, String> credentials=new LinkedHashMap<>();
        credentials.put("username1","password1");
        credentials.put("username2","password2");
        credentials.put("username3","password3");
        credentials.put("username4","password4");
        credentials.put("username5","password5");
        credentials.put("username6","password6");
        credentials.put("username7","password7");
        credentials.put("username8","password8");
        credentials.put("username9","password9");
        credentials.put("username10","password10");

        for (Map.Entry<String, String> each : credentials.entrySet()) {
            String username=each.getKey();
            String password=each.getValue();
            System.out.println("Credentials Entered: "+username+" : "+password);
        }

        for (Map.Entry<String, String> each : credentials.entrySet()) {
            System.out.println(each);
        }
    }
}
