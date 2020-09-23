package String.palindrome;

public class PalindromeString1 {
    public static void main(String[] args) {
        String str="radar";
        palindrome(str);
        System.out.println(palindrome((str)));
    }

    public static boolean palindrome(String word) {


        String reversed = "";
        for (int i = word.length() - 1; i>=0; i--) {
            reversed += word.charAt(i);
            if (word.equals(reversed)) {
            }
            return true;
        }
        return false;
    }
}




