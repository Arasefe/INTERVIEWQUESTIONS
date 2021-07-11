import java.util.*;

public class Study3 {

    public static void main(String[] args) {

    }

    public static void frequency(Object[] arr) {

        List<Object> list = new ArrayList<Object>(Arrays.asList(arr));


        int maxFr = 0;

        for (int i = 0; i < list.size(); i++) {

            int fr = Collections.frequency(list, list.get(i));

            if (fr > maxFr) {
                maxFr = fr;
            }
            System.out.println(list.get(i));
        }

    }

    public static boolean empty(String str) {
	/*
	Write a Java/Javascript program to check whether a string is blank or not.
    Sample Input: ''
    Sample Input: 'abc'
	*/


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return true;
            }
        }

        return false;

    }
}
