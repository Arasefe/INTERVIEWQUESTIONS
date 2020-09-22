package interviewSet_1;
import java.util.Arrays;
public class Anagram {
    //2.Write a method where u check to see if the word u pass is Anagram
    public static void main(String[] args) {
        boolean result=anagram("Ayse","seya");
        System.out.println(result);
    }

    public static boolean anagram(String word1, String word2){
        char []ch1=word1.toLowerCase().toCharArray();
        char []ch2=word2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String newStr1="";
        for(char each:ch1){
            newStr1+=each;
        }

        String newStr2="";
        for(char each:ch2){
            newStr2+=each;
        }


        boolean result=newStr1.equals(newStr2);
       return result;


    }

}
