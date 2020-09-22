package String.frequencyofchars;
/*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


 */
public class FrequencyOfChars4 {
    public static void main(String[] args) {
        frequencyOfChars1("sdjhshdhaka");
    }

    public static void frequencyOfChars1(String str) {
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
}
