package iteratorPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorExample2 {
    public static void main(String[] args) {
        methodIterateAndRemove1();
        methodIterateAndRemove1();
        methodIterateAndRemove1();
    }

    public static void methodIterateAndRemove1() {
        List<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList("Aras", "Tulpar", "Efe", "Ege", "Banu", "Ismail"));
        /*
        for (int i = 0; i < lst.size(); i++) {          // [Tulpar, Ege, Ismail]
            lst.remove(lst.get(i));
        }
        */


        for (String name : lst) {                         // ConcurrentModificationException
            lst.remove(name);
        }
        /*

        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            itr.remove();
        }

         */

        System.out.println(lst);

    }

    public static void methodIterateAndRemove2(){
        List<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList("Aras","Tulpar","Efe","Ege","Banu","Ismail"));

        for (String name : lst) {                         // ConcurrentModificationException
            lst.remove(name);
        }
        System.out.println(lst);
    }
}