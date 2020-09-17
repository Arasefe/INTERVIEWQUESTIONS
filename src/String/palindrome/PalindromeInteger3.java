package String.palindrome;

public class PalindromeInteger3 {
    public static boolean isPalindrome(int num){            //1021
        boolean isPalindrome = true;
        String str = String.valueOf(num);                   //"1021"  String str = String.valueOf(num);

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
       //isPalindrome(10001)
        System.out.println(isPalindrome(101454101));
    }
}
