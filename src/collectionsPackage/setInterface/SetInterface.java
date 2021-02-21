package collectionsPackage.setInterface;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetInterface {

    public static void main(String[] args) {
        setMethod1();
    }

    public static void setMethod1(){
        Set<Integer>set=new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("HashSet"+set);
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("HashSet"+set);

    }

    public static void setMethod2(){
        Set<Integer>set=new LinkedHashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("LinkedHashSet"+set);
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("LinkedHashSet"+set);
    }

    public static void setMethod3(){
        Set<Integer> set=new TreeSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Set"+set);
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Set"+set);
    }

    public static void setMethod4(){
        Set<Integer>set=new ConcurrentSkipListSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Stack"+set);
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Stack"+set);
        set.add(9);

        System.out.println("Stack after pop"+set);
    }

    public static void setMethod5(){
        Set<Integer>set=new CopyOnWriteArraySet<>();
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Set"+set);
        set.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Set"+set);

    }

}
