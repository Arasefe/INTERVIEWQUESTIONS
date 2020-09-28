package cybertek_interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        frequencyOfChars("AADDJSDDSFSFFMS");
    }

    public static void frequencyOfChars(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.charAt(i) + "")) nonDup += str.charAt(i);
        }

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for (int i = 0; i < nonDup.length(); i++) {
            int count = Collections.frequency(list, list.get(i));
            result += nonDup.charAt(i) + "" + count;
        }
        System.out.println(result);
    }

    public static void frequencyOfChars1(String str) {
        String unrepeated = "";
        String word = "";
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            String s = "" + str.charAt(i);
            if (!unrepeated.contains(s)) {
                unrepeated += s;
            }
        }
        for (int i = 0; i < unrepeated.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == unrepeated.charAt(i)) {
                    count++;
                }
            }
            word += unrepeated.charAt(i) + "" + count;
        }
        System.out.println(word);
    }

    public static void frequencyOfChars2(String str) {    //arasaa
        String word = "";
        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            String each = "" + str.charAt(i);
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        for (int i = 0; i < nonDup.length(); i++) {//ars
            int count = Collections.frequency(Arrays.asList(str.split("")), nonDup.charAt(i) + "");
            word += nonDup.charAt(i) + "" + count;
        }

        System.out.println(word);
    }

    public static void frequencyOfChars3(String str) {

        for (int i = 0; i < str.length(); i++) {
            int count = Collections.frequency(Arrays.asList(str.split("")), str.charAt(i) + "");
            System.out.print(count);
        }

    }


    public static void frequencyOfChars4(String str) {

        String nonDup = "";
        String result = "";


        for (int i = 0; i <= str.length() - 1; i++) {   // removing duplicates from str
            String ch = "" + str.charAt(i);
            if (!nonDup.contains(ch)) {
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        for (int j = 0; j <= nonDup.length() - 1; j++) {
            char ch = nonDup.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count += 1;
                }
            }

            result += "" + ch + count;

        }

        System.out.println(result);
    }


    public static void frequencyOfChars5(String str) {
        String nonDup = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.charAt(i) + "")) nonDup += str.charAt(i);
        }
        System.out.println(nonDup);

        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == nonDup.charAt(i)) {
                    count++;
                }

            }
            result += nonDup.charAt(i) + "" + count;
        }
        System.out.println(result);
    }

    public static String frequencyOfChars6(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.charAt(i) + "")) nonDup += str.charAt(i);
        }
        String result = "";

        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == nonDup.charAt(i)) count++;
            }
            result += nonDup.charAt(i) + "" + count;
        }
        //System.out.println(result);
        return result;
    }


}