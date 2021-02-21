package collectionsPackage.setInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        removeDuplicates1();
        removeDuplicates2();
    }

    public static void removeDuplicates1(){
        Set<String>set=new HashSet<>();
        set.addAll(Arrays.asList("hfhdhdhdhdhjdjf".split("")));
        System.out.println(set);
    }

    public static void removeDuplicates2(){
        //if the strings are composed of same elements
        String str1="cccaaaaabbbb";
        String str2="abc";

        str1=new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2=new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2));
    }
}
