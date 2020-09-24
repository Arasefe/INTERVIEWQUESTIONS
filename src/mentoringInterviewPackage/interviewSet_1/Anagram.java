package mentoringInterviewPackage.interviewSet_1;
import java.util.Arrays;
public class Anagram {
    //2.Write a method where u check to see if the word u pass is Anagram
    public static void main(String[] args) {
        boolean result=anagram("Aras","Sera");
        System.out.println(result);

        boolean result1=anagram2("Banu","unab");
        System.out.println(result1);
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

    public static boolean anagram2(String str1, String str2){
        String[]strArray1=str1.toLowerCase().split("");
        String[]strArray2=str2.toLowerCase().split("");
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        return Arrays.equals(strArray1,strArray2);

    }

}
