package cybertek_interviewPrep;

public class _36Palindrome {
    public static void main(String[] args) {

    }

    public static boolean palindrome(int number) {              //13456
        String word = "" + number;                              // "13456"
        String reversed = "";                                   //""
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);                         //"65431"
            if (word.equals(reversed)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberPalindrome1(int num) {
        int original = num;                                       // 91098
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            reversedNum = reversedNum * 10 + digit;                   //Onemli
        }
        if (reversedNum == original) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(int num) {            //1021
        boolean isPalindrome = true;
        String str = String.valueOf(num);                   //"1021"  String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

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
