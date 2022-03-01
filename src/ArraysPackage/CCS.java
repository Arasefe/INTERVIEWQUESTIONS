package ArraysPackage;

import java.util.Arrays;

public class CCS {

    public static void main(String[] args) {
        method(new int[]{1,1,0,0,0,0,1});
    }

    public static void method(int[]array){
        int temp;
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==1){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
