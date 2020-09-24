package mentoringInterviewPackage.interviewSet_1;


import java.util.Arrays;

public class ReverseSentence {
    //3.Write a method where u reverse a sentence.

    public static void main(String[] args) {

        reverseSentence("The more you study the better you will be");
        reverseString("Aras Efe");
    }

    public static void reverseSentence(String sentence){
        String [] array=sentence.split(" ");

        String [] newArr=new String[array.length];

        for(int i= array.length-1;i>=0;i--){
            newArr[array.length-(i+1)]=array[i];
        }

        System.out.println(Arrays.toString(newArr));


    }


    public static void reverseString(String str){
        String reversed="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);

    }
}
