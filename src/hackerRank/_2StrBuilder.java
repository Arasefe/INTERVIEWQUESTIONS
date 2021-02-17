package hackerRank;

import java.util.ArrayList;

public class _2StrBuilder {
    public static void main(String[] args) {
        ArrayList<StringBuilder>myList=new ArrayList<>();
        StringBuilder SB1=new StringBuilder("Java");
        StringBuilder SB2=new StringBuilder("Python");
        StringBuilder SB3=new StringBuilder("Scala");
        StringBuilder SB4=new StringBuilder("Angular");

        myList.add(SB1);
        myList.add(SB2);
        myList.add(SB3);
        myList.add(SB4);
        myList.remove(1);
        for (StringBuilder el:myList)
            System.out.println(el);
        myList.remove(SB3);
        myList.remove(new StringBuilder("Angular"));

        for (StringBuilder element:myList) {
            System.out.println(element);
        }
    }
}
