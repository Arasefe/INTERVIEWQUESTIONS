package collectionsPackage.ListInterface;



import java.util.*;

public class ListInterface1 {
    public static void main(String[] args) {
        listMethod1();
        listMethod2();
        listMethod3();
        listMethod4();
    }

    public static void listMethod1(){
        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("ArrayList"+list);
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("ArrayList"+list);
    }

    public static void listMethod2(){
        List<Integer>list=new LinkedList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("LinkedList"+list);
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("LinkedList"+list);
    }

    public static void listMethod3(){
        List<Integer>vektor=new Vector<>();
        vektor.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Vektor"+vektor);
        vektor.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Vektor"+vektor);
    }

    public static void listMethod4(){
        List<Integer>stack=new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Stack"+stack);
        stack.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Stack"+stack);
        stack.add(0,9);
        ((Stack)stack).pop();
        System.out.println("Stack after pop"+stack);
    }

}