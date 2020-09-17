package String.palindrome;

public class PalindromeInteger1 {
    public static boolean palindrome(int number) {          //13456
        String word=""+number;                              // "13456"
        String reversed="";                                 //""
        for (int i = word.length()-1; i >= 0; i--) {
            reversed += word.charAt(i);                     //"65431"
            if (word.equals(reversed)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(palindrome(-222));
    }
}
