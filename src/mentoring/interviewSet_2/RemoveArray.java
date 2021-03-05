package mentoring.interviewSet_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class RemoveArray {
    // Write a removeAll() takes two parameters: an ArrayList of Strings called wordList,
    // and a String called targetWord.So remove the targetWord from ArrayList.EX :ArrayList("hi","hey","hi","yo"));  ----> removeAll(wordList,"hi"); --->["hey","yo"]

    public static void main(String[] args) {

        removeAll(new ArrayList<String>(Arrays.asList("Aras", "Tulpar", "Ismail", "Banu")), "Aras");
        removeAll2(new ArrayList<String>(Arrays.asList("Aras", "Tulpar", "Ismail", "Banu")), "Aras");
        removeAll3(new ArrayList<String>(Arrays.asList("Aras", "Tulpar", "Ismail", "Banu")), "Aras");

    }

    public static void removeAll(ArrayList<String> list, String targetWord) {

        list.removeIf(p -> p.equals(targetWord));

        System.out.println(list);
    }

    public static void removeAll2(ArrayList<String> list, String targetWord) {

        Iterator<String> names = list.iterator();
        while (names.hasNext()) {
            String str=names.next();
            if (str.equals(targetWord)) {
                names.remove();
            }
        }
        System.out.println(list);

    }

    public static void removeAll3(ArrayList<String> list, String targetWord){
        ListIterator<String>names=list.listIterator();
        while(names.hasNext()){
            String str=names.next();
            if(str.equals(targetWord)){
                names.remove();
            }
        }
        System.out.println(list);
    }
}
