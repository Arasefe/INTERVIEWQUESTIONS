import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Study2 {
    /*
    Given an input string (assume it's essentially a paragraph of text) and a word to find,
    return the number of times in the input string that the word is found.
     */
    public static void main(String[] args) {
        String str="Given an input string (assume it's essentially a paragraph of text) and a word to find, return the number of times in the input string that the word is found.";
        String word="an";
        method(str,word);
    }
    public static void method(String str, String word){
        List<String>list=new LinkedList<>(Arrays.asList(str.split(" ")));
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
