package interviewPrep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddCommaToString {
    public static void main(String[] args) {
        addComma("Too many cook spoil the broth");
    }
    private static void addComma(String str){
        String myStr=str.replaceAll(" ","");
        List<String>list=new LinkedList<>(Arrays.asList(myStr.split("")));
        System.out.println(list);
        String newStr=list.toString().replace("[","").replace("]","");
        System.out.println(newStr);
    }
}
