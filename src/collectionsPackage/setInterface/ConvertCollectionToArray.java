package collectionsPackage.setInterface;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConvertCollectionToArray {
    public static void main(String[] args) {
        convertCollectionToArray1();
        convertCollectionToArray2();
    }

    public static void convertCollectionToArray1() {
        // Remove the duplicate names
        String[] names = {"Aras", "Tulpar", "Aras", "Banu", "Ismail", "Tulpar"};
        // Remove the duplicates
        Set<String> set = new LinkedHashSet<>(Arrays.asList(names));
        System.out.println(set);
        // Convert Set to Array
        names=set.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }

    public static void convertCollectionToArray2() {
        // Remove the duplicate names
        String[] names = {"Efe", "Tulpar", "Aras", "Banu", "Ismail", "Tulpar","Ege"};
        // Remove the duplicates
        // Convert Set to Array
        names=new LinkedHashSet<>(Arrays.asList(names)).toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
