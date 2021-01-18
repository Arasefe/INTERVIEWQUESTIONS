package iteratorPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public  class IteratorExample1 {
    public static void main(String[] args) {
        //methodIterateAndRemove1();
        //methodIterateAndRemove2();
        //methodIterateAndRemove3();
        //methodIterateAndRemove4();
        methodIterateAndRemove5();
    }

    public static void methodIterateAndRemove1() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(1, 2, 4, 5, 7, 8, 9));
        /*
        for (int i = 0; i < lst.size(); i++) {          // [2,5,7]
            lst.remove(lst.get(i));
        }
         */

        /*
        for (Integer i : lst) {                         // ConcurrentModificationException
            lst.remove(i);
        }
         */

        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            itr.remove();
        }

        System.out.println(lst);

    }

    public static void methodIterateAndRemove2() {

        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(121, 322, 34, 55, 79, 85, 91));
        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()) {

            Integer i = itr.next();
            if (i == 34) {
                itr.remove();
            }
        }
        System.out.println(lst);

    }

    public static void methodIterateAndRemove3() {

        ArrayList<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList("Aras", "Tulpar", "Efe", "Ege", "Banu", "Ismail", "Ask"));
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {

            String i = itr.next();
            if (i.contains("ul")) {
                itr.remove();
            }
        }
        System.out.println(lst);

    }


    public static void methodIterateAndRemove4() {

        ArrayList<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList("Aras", "Tulpar", "Efe", "Ege", "Banu", "Ismail", "Ask"));

        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).contains("ul")){
                lst.remove(lst.get(i));
            }
        }
        System.out.println(lst);

    }

    public static void methodIterateAndRemove5() {

        ArrayList<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList("Aras", "Tulpar", "Efe", "Ege", "Banu", "Ismail", "Ask"));

        for (String name: lst) {
            if(name.contains("ul")){
                lst.remove(name);
            }
        }
        System.out.println(lst);

    }


}
