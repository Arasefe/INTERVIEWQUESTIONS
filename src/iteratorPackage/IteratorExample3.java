package iteratorPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample3 {

    public static void main(String[] args) {
        //iteratorMethod();
        //iteratorMethod2();
        //iteratorMethod3();
        iteratorMethod4();
    }

    public static void iteratorMethod() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(1, 2, 4, 5, 7, 8, 9));

        for (int i = 0; i < lst.size(); i++) {          // [2,5,7]
            if (lst.get(i) < 5) {
                lst.remove(i);
            }
        }

    }

    public static void iteratorMethod2() {
        //Remove the elements less than 5
        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(1, 2, 4, 5, 7, 8, 9, 11, 12));
        for (Integer each : lst) {                         // ConcurrentModificationException
            lst.remove(each);
        }
    }

    public static void iteratorMethod3() {
        //Remove the elements less than 5
        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9));
        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()) {
            if (itr.next() < 5) {
                itr.remove();
            }
            System.out.println(lst);
        }
    }
    public static void iteratorMethod4() {
        //Remove the elements less than 5
        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(1, 2, 4, 5, 7, 8, 9));
        lst.removeIf(p->p<5);
            System.out.println(lst);
        }
    }


