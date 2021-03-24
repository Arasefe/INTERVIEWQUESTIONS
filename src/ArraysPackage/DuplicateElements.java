package ArraysPackage;

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        //getDuplicate1(new String[] {"7","2","2","4","5"});
        //getDuplicate2(new String[] {"7","2","2","4","5"});
        getDuplicate3(new String[] {"7","2","2","4","4","5"});

    }

    public static void getDuplicate1(String[]arr){
        int counter=0;
        int i=0;
        for (i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    counter++;
                }

            }
            if(counter>1){
                System.out.println(arr[i]);
            }
        }

        System.out.println(counter);
    }

    public static void getDuplicate2(String []arr){
        List<String>list=new LinkedList<>(Arrays.asList(arr));
        List<String>duplicates=new ArrayList<>();
        int fr=0;
        for (String each : arr) {
            fr= Collections.frequency(list,each);
            if(fr>1){
                duplicates.add(each);

            }
        }

        String[]array=  duplicates.toArray(new String[0]);  // List to Array
        System.out.println(Arrays.toString(array));
    }

    public static void getDuplicate3(String[]arr){

        int counter=0;
        List<String>duplicates=new LinkedList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    counter++;
                }
            }
            if(counter>1){
                duplicates.add(arr[i]);
            }
        }
        System.out.println(duplicates);


    }
}
