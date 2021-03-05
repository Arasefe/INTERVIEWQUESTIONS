package mentoring.interviewSet_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Write a removeInst() method gets an Arraylist of Integers and a number(Integer).
// It removes any instance of the number it gets from the Arraylist.
// EX : removeInst([1,1,2,3,1,4],1) ---->  [2,3,4]
public class RemoveInst {
    public static void main(String[] args) {
        //removeInst1(new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 1, 8)), 1);
        removeInst2(new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 1, 8)), 1);
    }

    public static void removeInst1(ArrayList<Integer> list, int number) {

        list.removeIf(p -> p == number);
        System.out.println(list);
    }

    public static void removeInst2(ArrayList<Integer> list, int number) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i == number) {
                it.remove();
            }
        }
        System.out.println(list);
    }

}
