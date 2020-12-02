package cybertek_interviewPrep;

import java.util.*;

public class _27RemoveAhmed {
    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {
        //removeAhmed1();
        //removeAhmed1();
        removeAhmed3();
    }

    public static void removeAhmed1(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        Iterator<String> it = names.iterator();

        while(it.hasNext()) {

            if(it.next().equals("Ahmed"))

                it.remove();

        }
        System.out.println( names );

    }

    public static void removeAhmed2(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        for(ListIterator<String> it = names.listIterator(); it.hasNext();)

            if(it.next().equals("Ahmed"))

                it.remove();

        System.out.println(names);
    }

    public static void removeAhmed3() {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names.removeIf(p -> p.equals("Ahmed"));
        System.out.println(names);
    }
}
