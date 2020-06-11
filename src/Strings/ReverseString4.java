package Strings;

public class ReverseString4 {
    public static void main(String[] args) {

        String b = "ORACLE";

        String reversed = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            reversed = reversed + b.charAt(i);
            //System.out.println(temp);

        }
         System.out.println(reversed);
    }
}
