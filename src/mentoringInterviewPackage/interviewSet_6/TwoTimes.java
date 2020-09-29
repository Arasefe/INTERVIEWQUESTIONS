package mentoringInterviewPackage.interviewSet_6;

import java.util.ArrayList;
import java.util.Arrays;

// Write a method is called twoTimes(). This method should create a new ArrayList of Integers
// that contains every value of the ArrayList parameter repeated twice.
// EX: ArrayList<Integer> (List.of(1,5,3,7)) ---> (1,1,5,5,3,3,7,7)
public class TwoTimes {
    public static void main(String[] args) {
        twoTimes(new ArrayList<>(Arrays.asList(1,5,3,7)));
    }

    public static void twoTimes(ArrayList<Integer>list){
        ArrayList<Integer>twoTimes=new ArrayList<>(list.size()*2);
        for (int i = 0; i < list.size(); i++) {
            twoTimes.add(list.get(i));
            twoTimes.add(list.get(i));

        }
        System.out.println(twoTimes);
    }
}
