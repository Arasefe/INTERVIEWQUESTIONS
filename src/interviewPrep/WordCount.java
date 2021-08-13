package interviewPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WordCount {

    public static void main(String[] args) {
        String paragraph= "And response body should be Json format And the cut active should be false";
        String word="And";

        int i=wordCount2(paragraph,word);
        System.out.println(i);
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

    public static int wordCount2(String input, String whichWord){
        String str= input.replaceAll("\\p{Punct}"," ");
        List<String>list= new LinkedList<>(Arrays.asList(str.split(" ")));
        System.out.println(list);
        System.out.println(whichWord);
        int   count= Collections.frequency(list,whichWord.toLowerCase());
        count= Collections.frequency(list,whichWord);

        return count;
    }
}
