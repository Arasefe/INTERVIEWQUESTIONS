package interviewPrep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddCommaToString {
    public static void main(String[] args) {
        addComma1("Too many cooks spoil the broth");
        addComma1("Arasefe");
    }
    private static void addComma1(String str){
        String myStr=str.replaceAll(" ","");
        List<String>list=new LinkedList<>(Arrays.asList(myStr.split("")));
        System.out.println(list);
        String newStr=list.toString().replace("[","").replace("]","");
        System.out.println(newStr);
    }

    private static void addComma2(String str){
        String myStr=str.replaceAll(" ","");
        List<String>list=new LinkedList<>(Arrays.asList(myStr.split("")));
        System.out.println(list);
        String newStr=list.toString().replace("[","").replace("]","");
        System.out.println(newStr);
    }
}
