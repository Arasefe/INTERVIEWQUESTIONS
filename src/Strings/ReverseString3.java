package Strings;

public class ReverseString3 {
    public static void main(String[] args) {

        String b = "Tulpar";

        String reversed = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            reversed = reversed + b.charAt(i);
            System.out.println(reversed);

        }
       // System.out.println(temp);
    }
}
