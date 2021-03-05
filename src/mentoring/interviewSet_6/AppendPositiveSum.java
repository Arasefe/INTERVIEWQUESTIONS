package mentoring.interviewSet_6;

import java.util.ArrayList;
import java.util.Arrays;

// appendPosSum() returns an ArrayList<Integer> and a parameter as an ArrayList<Integer>.
// This method should Create a new ArrayList of Integers.
// Add only the positive Integers to the new ArrayList.
// Sum the positive Integers in the new ArrayList and add the Sum as the last element.
// EX: if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
// the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
// The original ArrayList should remain unchanged.
public class AppendPositiveSum {
    public static void main(String[] args) {
        System.out.println(appendPosSum(new ArrayList<>(Arrays.asList(1,2,3,-4,-6,8,5))));
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer>list){
        ArrayList<Integer>newList=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>0){
                newList.add(list.get(i));
                sum+=list.get(i);
            }
        }
        newList.add(sum);
        return newList;
    }

}
