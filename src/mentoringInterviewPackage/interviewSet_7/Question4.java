package mentoringInterviewPackage.interviewSet_7;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        /*
         Write a method reverseVowels() that will return a string with reversed vowels.
         Input:str = "apple" --> Output:  str = "eppla"
         */
        reverseVowels("apple");

    }
    public static void reverseVowels(String str){
        String[]letter =str.split("");
        System.out.println(Arrays.toString(letter));
        int i=0;
        String temp="";
        for (i = 0; i < letter.length-1; i++) {
            if(letter[i].equals("a")||letter[i].equals("e")||letter[i].equals("o")||letter[i].equals("i")){
                temp=letter[i];
            }
            for (int j = 1; j < letter.length; j++) {
                if(letter[i].equals("a")||letter[i].equals("e")||letter[i].equals("o")||letter[i].equals("i")){
                    letter[i]=letter[j];
                    letter[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(letter));

    }
}
