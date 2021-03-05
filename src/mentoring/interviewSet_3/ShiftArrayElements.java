package mentoring.interviewSet_3;

import java.util.ArrayList;
import java.util.List;

public class ShiftArrayElements {
    // Given an array of integers. how do you put zeros at the end of array without sorting an array? For
    // example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0] Please explain logical approach


    public static void main(String[] args) {
        shiftElements(new int[]{4, 5, 0, 0, 2, 0, 1, 0});

    }

    public static void shiftElements(int[] array) {
        List<Integer> list = new ArrayList<>(array.length);
        //list.addAll(Arrays.asList(array));

        //list.add(2);

        for (int i = 0; i < array.length; i++) {
            list.add(new Integer(array[i]));

        }
        System.out.println(list);

        List<Integer> newList = new ArrayList<>(list.size());
        for (Integer each : list) {
            if (each != 0) {
                newList.add(each);

            }
        }

        for (Integer num : list) {

            if (num == 0) {
                newList.add(num);
            }
        }


        System.out.println(newList);


    }
}
