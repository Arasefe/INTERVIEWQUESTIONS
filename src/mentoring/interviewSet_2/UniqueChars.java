package mentoring.interviewSet_2;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueChars {
    //UniqueChars is a method that you will code now, should be able to accept any string in the world
    // and return unique characters from the parameter.
    //Examples:uniqueChars("java") ==> "jav"

    public static void main(String[] args) {
        uniqueElements1("java");
        uniqueElements2("java");
    }

    public static void uniqueElements1(String str) {
        String nonDup = "";
        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        System.out.println(nonDup);
    }


    public static void uniqueElements2(String str) {

        String uniques = "";
        ArrayList<String> list = new ArrayList(Arrays.asList(str.split("")));
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))){
                    count++;
                }
            }
            if (count == 1) {
                uniques += list.get(i);
            }
        }
        System.out.println(uniques);
    }
}
