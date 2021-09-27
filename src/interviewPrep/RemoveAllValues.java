package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAllValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {
        removeAllValues1();
    }

    public static void removeAllValues1() {
        removeGreaterThan100();
        removeAllValues();
    }
    public static void removeGreaterThan100() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));


        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            if (i > 100) {
                itr.remove();
            }
        }

        System.out.println(list);
    }


    public static void removeAllValues() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));


        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            itr.remove();
        }

        System.out.println(list);
    }
}
