package cybertek_interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _13SortAscending {

    public static void main(String[] args) {
        //sortAscending1();
        sortAscending2();
    }


    public static void sortAscending1(){
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.addAll(Arrays.asList(23,32,43,12,12,42,3,23,45,564,1211));

        list.stream().sorted().forEach(System.out::println);

    }

    public static void sortAscending2(){
        ArrayList<Integer>aLst=new ArrayList<>();
        aLst.addAll(Arrays.asList(12,3,13,4,545,34,64));


        aLst.stream().sorted().forEach(System.out::println);
        aLst.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }



}
