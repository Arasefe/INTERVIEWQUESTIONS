package String.frequencyofchars;

public class FrequencyOfChars1 {
    public static void main(String[] args) {
        frequencyOfChars("arasa");
    }

    public static void frequencyOfChars(String str){
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
}
