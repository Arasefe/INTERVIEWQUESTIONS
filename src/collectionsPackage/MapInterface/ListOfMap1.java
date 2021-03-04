package collectionsPackage.MapInterface;


import java.util.*;

public class ListOfMap1 {
    public static void main(String[] args) {
        listOfMap();
    }

    public static void listOfMap(){
        Map<String, String>scrum1=new LinkedHashMap<>();
        scrum1.put("Aras","SDET");
        scrum1.put("Tulpar","QA");
        scrum1.put("Banu","Scrum Master");
        scrum1.put("Ismail","BA");
        scrum1.put("Efe","PO");

        Map<String, String>scrum2=new LinkedHashMap<>();
        scrum2.put("John","SDET");
        scrum2.put("Ozzy","QA");
        scrum2.put("Elif","Scrum Master");
        scrum2.put("Michel","BA");
        scrum2.put("Imran","PO");

        Map<String, String>scrum3=new LinkedHashMap<>();
        scrum3.put("Dilfinar","SDET");
        scrum3.put("Atilla","QA");
        scrum3.put("Aidana","Scrum Master");
        scrum3.put("Kamran","BA");
        scrum3.put("Jennifer","PO");

        List<Map<String,String>>teams=new ArrayList<>(Arrays.asList(scrum1,scrum2,scrum3));
        System.out.println(teams);

        for (Map<String, String> team : teams) {
            System.out.println(team);
            for (Map.Entry<String, String> each : team.entrySet()) {
                String names=each.getKey();
                String jobTitle=each.getValue();
                if(jobTitle.equals("SDET")){
                    System.out.println(names);
                }
            }
        }
    }
}
