package iteratorPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample4 {


    public static void main(String[] args) {
        //iteratorMethod1();
        //iteratorMethod2();
        //iteratorMethod3();

    }

    public static void iteratorMethod1() {
        //Remove Aras
        String names[] = {"Aras", "Tulpar", "Efe", "Ege", "Banu", "Aras", "Aras"};
        ArrayList<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(names));

        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals("Aras")) {
                itr.remove();
            }
        }
        System.out.println(lst);
    }

    public static void iteratorMethod2() {
        //Remove Aras
        String names[] = {"Aras", "Tulpar", "Efe", "Ege", "Banu", "Aras", "Aras"};
        ArrayList<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(names));

        ;
        for (Iterator<String> itr = lst.iterator(); itr.hasNext(); ) {
            String each = itr.next();
            if (itr.next().equals("Aras")) {
                itr.remove();
            }
        }
        System.out.println(lst);
    }

    public static void iteratorMethod3() {
        //Remove Aras
        String names[] = {"Aras", "Tulpar", "Efe", "Ege", "Banu", "Aras", "Aras"};
        ArrayList<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(names));
        lst.removeIf(p->p.equals("Aras"));  // Internally uses Iterator
        System.out.println(lst);
    }
}
