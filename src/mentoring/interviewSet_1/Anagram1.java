package mentoring.interviewSet_1;
//Write a method where u check to see if the word u pass is Anagram

public class Anagram1 {
    public static void main(String[] args) {
        //System.out.println(anagram1("level"));
        System.out.println(anagram2("ara"));
    }

    public static boolean anagram1(String str) {
        String[] word = str.split("");

        String reverse = "";
        for (int i = word.length-1; i >= 0; i--) {
            reverse += word[i];
        }
        if (str.equals(reverse)) return true;
        else {
            return false;
        }
    }

    public static boolean anagram2(String str){
        char[]c=str.toCharArray();

        String reverse="";
        for(int i=c.length-1;i>=0;i--){
            reverse+=c[i];
        }
        if(str.equals(reverse)) return true;
        else{
            return false;
        }

    }

}
