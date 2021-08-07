package techproed.InterviewSet_Set1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates(new ArrayList<>(Arrays.asList(1,2,1,3,4,6,7,4)));
    }

    private static void removeDuplicates(List<Integer>list){

        List<Integer>nonDup=new ArrayList<>();
        for (Integer each : list) {
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);
    }
}
