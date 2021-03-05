package mentoring.interviewSet_1;

public class Palindrome {
    //6.A palindrome is a word, number, phrase, or other sequence
    // of characters which reads the same backward as forward,
    // such as madam or race car or the number 10801.
    // Write a program that will verify if word is palindrome

    public static void main(String[] args) {
        System.out.println(isPalindromeString1("ADA"));
        System.out.println(isPalindromeString2("ADAM"));

    }

    public static boolean isPalindromeString1(String word){

        String reversed = "";
        for (int i = word.length() - 1; i>=0; i--) {
            reversed += word.charAt(i);
            if (word.equals(reversed)) {
            }
            return true;
        }
        return false;
    }


    public static boolean isPalindromeString2(String str){
        String reversed="";
        int j=0;
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        if(str.equals(reversed)) return true;
        else{
            return false;
        }
    }

}
