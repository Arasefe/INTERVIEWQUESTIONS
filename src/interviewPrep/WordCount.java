package interviewPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WordCount {

    public static void main(String[] args) {
        String paragraph= "Response body should be Json format and the response code should be 200";
        String word="be";

        wordCount2(paragraph,word);

    }

    public static void wordCount(String paragraph, String word){
        int count=0;
        for (int i = 0; i < paragraph.length()-word.length(); i++) {
            if(paragraph.substring(i,i+word.length()).equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void wordCount2(String input, String word){
        List<String>list= new LinkedList<>(Arrays.asList(input.split(" ")));

        int   count= Collections.frequency(list,word.toLowerCase());
        System.out.println(count);

    }

    public static void wordFrequency1(String str, String word){
        str=str.replaceAll("\\p{Punct}","");
        int count=0;
        for (int i = 0; i <= str.length()-4; i++) {
            if(str.substring(i,word.length()).equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
