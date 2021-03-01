package rahul;

import java.util.ArrayList;
import java.util.List;

public class _11UniqueArrayElement {
    public static void main(String[] args) {
        uniqueNumbersArray(new int[]{1, 3, 12, 4, 3, 8, 12, 1});
    }

    public static void uniqueNumbersArray(int[] arr) {
        List<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            if (!uniques.contains(arr[i])) {
                uniques.add(arr[i]);
                counter++;
                for (int j =i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        counter++;
                    }
                }

//                System.out.println(arr[i]);
//                System.out.println(counter);
                if(counter==1){
                    System.out.println(arr[i]+" is the unique number");
                }
            }
        }
    }
}
