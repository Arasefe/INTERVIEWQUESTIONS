package mentoring.interviewSet_6;

import java.util.ArrayList;
import java.util.List;

public class PrintOnce {
    // Complete a void method printOnce() that will print all integers only once without
    // repeating them from an array of ints.EX : [1,1,2,3,4,5,4,5] ---> 1,2,3,4,5
    public static void main(String[] args) {
        //printOnce1(new int[]{1,1,2,3,4,5,4,5});
        printOnce2(new int[]{1,1,2,3,4,5,4,5});
    }

    public static void printOnce1(int[]array){
        List list=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(!list.contains(array[i])){
                list.add(array[i]);
            }
        }
        System.out.println(list);
    }


    public static void printOnce2(int[]array){
        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length-1; j++) {
                if(array[i]==array[j]){
                    break;
                }
            }
            System.out.println(array[i]);
        }
    }
















}
