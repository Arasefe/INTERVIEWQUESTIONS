package ArraysPackage;
import java.util.Arrays;

public class ArrayReverse3 {
    public static void reverseArrayMethod(int[]nums){
        /*
        Create a method it will take one parameter as an int array and
        the method will return reversed value of the array.
        (do it without using reverse method)
         */
        int reverse[]= new int [nums.length];
        for (int i=0, k=nums.length-1 ; i<nums.length ; i++, k-- ){
            reverse[i]=nums[k];
            System.out.println(reverse[i]);
        }
        System.out.println(Arrays.toString(reverse));       // print the reversed array as a String
    }

    public static void main(String[] args) {

       reverseArrayMethod(new int[]{1,3,5,7,9,15,56,89});
    }
}
