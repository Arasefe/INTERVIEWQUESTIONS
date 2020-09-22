package String.findtheunique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique2 {
    public static void main(String[] args) {
        findTheUnique("sdshkdcksdfh");
    }
    public static void findTheUnique(String str) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);
        String unique="";
        for (int i = 0; i < list.size(); i++) {
            int fr=Collections.frequency(list, str.charAt(i)+"");
            if(fr==1) unique+=str.charAt(i);
        }

        System.out.println(unique);
    }
}
