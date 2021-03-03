package ArraysPackage;

import java.util.Arrays;

public class ArrayReverse2 {
    /*
        Create a method it will take one parameter as an int array and
        the method will return the reversed array.
        (do it without using reverse method)
     */
    public static void main(String[] args) {
        reverseMethod(new int[]{1,2,4,9,15,23,30});
    }


    public static void reverseMethod(int []array){
      int []reverse=new int[array.length];

      for (int i=0,j=array.length-1;i<array.length;i++,j--){
          reverse[i]=array[j];
      }
        System.out.println(Arrays.toString(reverse));       

    }
}
