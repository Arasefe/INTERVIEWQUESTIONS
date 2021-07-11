package myInterviewQuetions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WordCount {

    public static void main(String[] args) {
        String paragraph="Given Accept type is Json\n" +
                "When user deletes an existing cut on FE\n" +
                "And user sends a GET request to see the deleted cut from endpoint\n" +
                "Then response status code should be 404\n" +
                "And response body should be Json format\n" +
                "And the cut active should be false";
        String word="And";
        //wordCount(paragraph,word);
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

    public static void wordCount2(String paragraph, String word){
        List<String>list=new LinkedList<>(Arrays.asList(paragraph.split(" ")));
        //System.out.println(list);


        int count=0;

        for (int i = 0; i < list.size(); i++) {
            count= Collections.frequency(list,list.get(i));
            String each=list.get(i)+": "+count;
            System.out.println(each);
        }




    }
}
