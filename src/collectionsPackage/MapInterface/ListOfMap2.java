package collectionsPackage.MapInterface;

import java.time.LocalDate;
import java.util.*;

public class ListOfMap2 {
    public static void main(String[] args) {
        listOfMap();
    }

    public static void listOfMap(){
        Map<String, LocalDate>scrum1=new LinkedHashMap<>();
        scrum1.put("Aras",LocalDate.of(2000,9,13));
        scrum1.put("Tulpar",LocalDate.of(1976,2,1));
        scrum1.put("Banu",LocalDate.of(1999,3,21));
        scrum1.put("Ismail",LocalDate.of(1987,11,4));
        scrum1.put("Efe",LocalDate.of(1998,8,20));

        Map<String, LocalDate>scrum2=new LinkedHashMap<>();
        scrum2.put("John",LocalDate.of(1989,1,1));
        scrum2.put("Ozzy",LocalDate.of(2000,2,13));
        scrum2.put("Elif",LocalDate.of(1988,4,10));
        scrum2.put("Michel",LocalDate.of(2001,9,23));
        scrum2.put("Imran",LocalDate.of(1999,11,3));

        Map<String, LocalDate> scrum3=new LinkedHashMap<>();
        scrum3.put("Dilfinar",LocalDate.of(2000,9,1));
        scrum3.put("Atilla",LocalDate.of(1987,1,11));
        scrum3.put("Aidana",LocalDate.of(1986,9,12));
        scrum3.put("Kamran",LocalDate.of(2000,4,13));
        scrum3.put("Jennifer",LocalDate.of(1988,8,13));

        List<Map<String,LocalDate>> teams=new ArrayList<>(Arrays.asList(scrum1,scrum2,scrum3));
        System.out.println(teams);

        for (Map<String, LocalDate> team : teams) {
            for (Map.Entry<String, LocalDate> each : team.entrySet()) {
                System.out.println(each);
            }
        }

    }
}
