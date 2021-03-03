package ArraysPackage;
import java.util.Arrays;
public class ArrayReverse1 {

    public static void main(String[] args) {

        int[] array = { 1, 5, 3, 7, 11, 9, 15};
        //reverse1(array);
        reverse2(array);

    }

    private static void reverse1(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }

    public static void reverse2(int[]array){
        int temp=0;
        int maxInd=array.length-1;

        for (int i = 0; i < array.length; i++) {
            temp=array[i];
            array[i]=array[maxInd-i];
            array[maxInd-i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }

}

