package hackerRank;

import java.util.Collections;
import java.util.LinkedList;

public class _7SwapColl {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();
        list.add("java");
        list.add("is");
        list.add("multithreaded");
        list.add("and");
        list.add("Platform");
        list.add("independent");

        Collections.swap(list,2,6);
        for(String str:list){
            System.out.println(" "+str);
        }
    }
}
