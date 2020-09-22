package String.frequencyofchars;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars2 {
    public static void main(String[] args) {
        frequencyOfChars("arasaa");
        frequencyA("Arasa");
    }

    public static void frequencyOfChars(String str) {    //arasaa
        String word = "";
        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            String each = "" + str.charAt(i);
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        for (int i = 0; i < nonDup.length(); i++) {//ars
            int count = Collections.frequency(Arrays.asList(str.split("")), nonDup.charAt(i)+"");
            word += nonDup.charAt(i) + "" + count;
        }

        System.out.println(word);
    }

    public static void frequencyA(String str) {

        for (int i = 0; i < str.length(); i++) {
            int count = Collections.frequency(Arrays.asList(str.split("")), str.charAt(i)+"");
            System.out.print(count);
        }

    }

}