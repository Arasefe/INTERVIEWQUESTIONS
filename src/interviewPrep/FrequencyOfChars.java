package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        frequencyOfCharsInString1("AADDJSDDSFSFFMS");
    }

    public static void frequencyOfCharsInString1(String str) {
        String nonDup="";
        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=""+str.charAt(i);
            }
        }
        String result="";

        for (int i = 0; i < nonDup.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(nonDup.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=""+nonDup.charAt(i)+count;
        }
        System.out.println(result);

    }



    public static void frequencyOfCharsInString2(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.charAt(i) + "")) {
                nonDup += str.charAt(i);
            }
        }

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for (int i = 0; i < nonDup.length(); i++) {
            int count = Collections.frequency(letters,letters.get(i));
            result += nonDup.charAt(i) + "" + count;
        }
        System.out.println(result);
    }

    public static void frequencyOfCharsInString3(String str) {
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

    public static void frequencyOfCharsInString4(String str) {    //arasaa
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

    public static void frequencyOfCharsInString5(String str) {

        for (int i = 0; i < str.length(); i++) {
            int count = Collections.frequency(Arrays.asList(str.split("")), str.charAt(i) + "");
            System.out.print(count);
        }

    }


    public static void frequencyOfCharsInString6(String str) {

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


    public static void frequencyOfCharsInString7(String str) {
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

    public static String frequencyOfCharsInString8(String str) {
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
