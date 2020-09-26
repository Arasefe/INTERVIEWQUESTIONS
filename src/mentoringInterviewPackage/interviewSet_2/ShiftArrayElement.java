package mentoringInterviewPackage.interviewSet_2;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftArrayElement {
    // Shift the first element of the array to the end and keep the rest the same

    public static void main(String[] args) {
        shiftArrayElement(new String[]{"1","2","3","4","5"});
        shiftArrayElement2(new int[]{2,54,5,23,435});
    }


    public static void shiftArrayElement(String[]array){
        String temp=array[0];
        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList(array));
        list.remove(0);
        list.add(temp);
        System.out.println(list);

    }

    public static void shiftArrayElement2(int[]array){

        int temp=array[0];
        ArrayList<Integer>list=new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            list.add(new Integer(array[i]));
        }
        list.remove(0);
        list.add(new Integer(temp));
        System.out.println(list.toString());


    }
}
