package myInterviewQuetions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NadiaTest {

    public static void main(String[] args) {
        /**
         * Objective:
         * Write a method that takes in the 2 arrays provided as parameters then displays the values as:
         *          "title", "category"
         * In main, call the method that was created to test the function.
         */
        String[] titlesArray = {"Pluto TV Kids", "CNET", "Pluto TV Sports", "Naturescape", "Fear Factor", "Flicks of Fury",
                "PeopleTV", "Rescue 911", "The Amazing Race", "Pluto TV Drama Life", "Western TV"};

        String[] categoriesArray = {"5c12fe491c932b67bd8e3d80", "5c12f932be491cbd678e3d87", "5c12fe491cbd932b678e3d8f",
                "5cffe094ad44e55543791bfc", "5f19a84079572700079d28e0", "5c12fe2b678e3491cbd93d84",
                "5c12fe491cbd932b678e3d7b", "5f18407959a72700079d28e0", "5f197995727a808e04070d20",
                "5f19a84079572700079d28e0", "5f19a8763eae7b0007f5c45e"};

        //combiner1(titlesArray,categoriesArray);
        //combiner2(titlesArray,categoriesArray);
        //combiner3(titlesArray,categoriesArray);
        //combiner4(titlesArray,categoriesArray);
        combineArrays(titlesArray,categoriesArray);


    }

    public static void combiner1(String[]array1, String []array2) {
        //String [] arrCombined=new String[array1.length];

        List<String>list=new LinkedList<>();

        for (int i = 0; i < array1.length; i++) {
            list.add("["+array1[i]+", "+array2[i]+"]");
        }
        System.out.println(list);

    }

    public static void combiner2(String []arr1,String[]arr2){
        String[]combined=new String[arr1.length];
        int i=0;
        for (String each : arr1) {
            combined[i]=each+","+arr2[i];
            i++;
        }
        System.out.println(Arrays.toString(combined));

    }


    public static void combiner3(String[]arr1,String[]arr2){
        List<String>list=new LinkedList<String>();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]+" --> "+arr2[i]+"\n");
        }
        System.out.println(list);
    }


    public static void combiner4(String[]first,String[]second){
        String result="";
        int i=0;
        for (String each : first) {
            result+=each+","+second[i]+"\n";
            i++;
        }

        System.out.println(result);

        String[]arr=result.split(",");
        System.out.println(Arrays.toString(arr));
    }

    //combine two arrays by one to one elements
    public static void combineArrays(String[] arr1, String[] arr2){
        //first format
        IntStream
                .range(0, Math.min(arr1.length, arr2.length))
                .mapToObj(i -> arr1[i] + "," + arr2[i])
                .collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        //second format
        List<String> output =  IntStream
                .range(0, Math.min(arr1.length, arr2.length))
                .mapToObj(i -> arr1[i] + ":" + arr2[i]+"\n")
                .collect(Collectors.toList());
        System.out.println(output);
    }

}
