package lambdaPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithString1 {
    public LambdaWithString1() {
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        System.out.println(getRemainingEl(list));
        /*
        Use Functional Programming
        Create a method to remove the list elements whose lengths are less than 5
         */
    }

    public static List<String> getRemainingEl(List<String> list) {
        list.removeIf(p -> p.length() > 5);
        return list;
    }

    /*
        Use Functional Programming
        Create a method to remove the list elements whose lengths are less than 5
         */
    public static List<String> sortLengthUpper(List<String> list) {
        list.stream().map(String::toUpperCase).sorted(Comparator.comparing(p->p.length())).forEach(System.out::println);
        return list;
    }

    /*
        Use Functional Programming
        Create a method to check if the lengths of elements are less than 8
         */
    public static boolean checkLength(List<String> list) {
        return list.stream().allMatch(p->p.length()<8);
    }






}
