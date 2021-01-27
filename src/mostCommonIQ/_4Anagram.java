package mostCommonIQ;

import java.util.Arrays;

public class _4Anagram {
    public static void main(String[] args) {
        anagramTest1("Mother In Law","Hitler Woman");
    }

    public static void anagramTest1(String str1, String str2){

        String newStr1="";
        for (char ch:str1.toCharArray()) {
            if(ch!=' '){
                newStr1+=ch;
            }
        }

        String newStr2="";
        for (char ch:str2.toCharArray()) {
            if(ch!=' '){
                newStr2+=ch;
            }
        }

        char[]ch1=newStr1.toLowerCase().toCharArray();
        char[]ch2=newStr2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
