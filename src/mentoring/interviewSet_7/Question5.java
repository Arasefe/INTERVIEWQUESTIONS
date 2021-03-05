package mentoring.interviewSet_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question5 {
    public static void main(String[] args) {
        /*
        The method printList accepts an ArrayList of ArrayLists and returns it as a string.
        Method concatenates all values from each ArrayList and returns it as one.
        EX : printList([["a",b],["c",d]]) --> "abcd"
         */
        ArrayList<ArrayList>list=new ArrayList<>();
        ArrayList<String>word1=new ArrayList<>();
        word1.addAll(Arrays.asList("a","b"));
        ArrayList<String>word2=new ArrayList<>();
        word2.addAll(Arrays.asList("c","d"));

        list.add(0,word1);
        list.addAll(1, Collections.singleton(word2));
        printList(list);

    }
    public static void printList(ArrayList<ArrayList>loaL){
        String result="";
        for (int i = 0; i < loaL.size(); i++) {
            for (int j = 0; j < loaL.get(i).size(); j++) {
                result+=loaL.get(i);
            }
        }
        System.out.println(result);
    }
}
