package interviewPrep;



import java.util.HashMap;

public class PrintRepeatedChars {
    public static void main(String[] args) {
        printRepeated("sjhdskdclksdfjadcafd");
    }
    private static void printRepeated(String str){
        String[]arr=str.split("");
        HashMap<String, Integer>map=new HashMap<>();
        for (String each : arr) {
            if(!map.containsKey(each)){
                map.put(each,1);
            }else{
                map.put(each,map.get(each)+1);
            }
        }
        System.out.println(map);
    }

    public static String printRepeatedChars(String str) {

        //1.Way
        String s = "";

        for(int i=0; i<str.length(); i++) {
            String s1 = str.substring(i, i+1);

            if(str.indexOf(s1) != str.lastIndexOf(s1)) {

                if (!s.contains(s1)) {
                    s = s + s1;
                }

            }

        }
        return s;
    }


}
