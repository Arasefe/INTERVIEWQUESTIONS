package mostCommonIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _8CompareArrays {
    public static void main(String[] args) {
        //compareArrays(new int[]{1,5,9,45,2},new int[]{5,17,2,9,33});
        //compareArrays2(new int[]{1,5,9,45},new int[]{5,17,9,33});
        compareArrays3(new int[]{1,5,9,45},new int[]{5,17,9,33});
    }
    public static void compareArrays(int[]array1,int[]array2){
        List<Integer>common=new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i]==array2[j]){
                    common.add(array1[i]);
                }
            }
        }
        Integer[]arr=common.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
    public static void compareArrays2(int[]array1,int[]array2){
        List<Integer>common=new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i]==array2[j]){
                    break;
                }if (array1[i]!=array2[j]){
                    common.add(array1[i]);
                }
            }
        }
        Integer[]arr=common.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }

    public static void compareArrays3(int[]array1,int[]array2){
        List<Integer>common=new ArrayList<>();
        for (int each : array1) {
            for (int i : array2) {
                if(i==each){
                    break;
                }else{
                    common.add(each);
                }

            }
        }

        Integer[]arr=common.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
}
