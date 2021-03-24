package collectionsPackage.MapInterface;

import java.util.ArrayList;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {

        ArrayList<Integer> aList=new ArrayList<Integer>();
        aList.add(1);
        aList.add(5);
        aList.add(2);
        aList.add(90);
        aList.add(34);

        System.out.println(method1(aList));
    }

    public static List<Integer> method1(List<Integer> numbers){
        //int min=Integer.MAX_VALUE;
        int temp=0;
        for(int i=0;i<numbers.size();i++){
            for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(j)<numbers.get(i)){
                    temp=numbers.get(i);
                    numbers.set(i,numbers.get(j));
                    numbers.set(j,temp);
                }
            }
        }
        return numbers;
    }


    public static List<Integer> method2(List<Integer> numbers) {
        int temp=0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(j)<numbers.get(i)){
                    temp=numbers.get(i);
                    numbers.set(i,numbers.get(j));
                    numbers.set(j,temp);
                }
            }
        }
        return numbers;
    }














}
