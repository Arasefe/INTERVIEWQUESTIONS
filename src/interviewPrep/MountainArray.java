package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MountainArray {
    /*
     * Mountain Array ==> [0, 2, 5, 3, 1, 0] It is constantly increasing to
     * the maximum value, decreasing constantly after the maximum value
     *
     * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
     * the maximum value, decreasing and increasing after the maximum value
     *
     * Create a method to check if it is Mountain Array or not. Use as possible as
     * Functional Programming
             Solution Steps:
             1)Find the element whose value is maximum
             2)From first element to maximum element, elements should be in ascending order
             3)From the maximum element to last element, elements should be in descending order
         */
    public static void main(String[] args) {
        checkArrayToBeMountain();
    }

    public static void checkArrayToBeMountain() {

        int []arr = {0, 2, 5, 3, 1};

        //1.Step
        //Create a list
        List<Integer> list = new ArrayList<>();
        //Add all array elements into the list
        Arrays.stream(arr).forEach(p -> list.add(p));
        //Find the maximum element in the list
        int max = list.stream().reduce(Integer.MIN_VALUE, Math::max);
        //Find the index of Maximum element
        int idxOfMax = list.indexOf(max);

        System.out.println(max);//5
        System.out.println(idxOfMax);//5
    }


}
