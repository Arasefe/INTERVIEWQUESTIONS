package iteratorPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public  class IteratorExample1 {
    public static void main(String[] args) {
        ArrayList<Integer>lst=new ArrayList<>();
        lst.addAll(Arrays.asList(1,2,4,5,7,8,9));
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

        Iterator<Integer>itr=lst.iterator();
        while(itr.hasNext()){
            Integer i=itr.next();
            itr.remove();
        }

        System.out.println(lst);

    }
}
