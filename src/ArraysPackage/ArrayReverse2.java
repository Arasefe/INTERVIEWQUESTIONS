package ArraysPackage;

import java.util.Arrays;

public class ArrayReverse2 {
    /*
        Create a method it will take one parameter as an int array and
        the method will return the reversed array.
        (do it without using reverse method)
     */
    public static void reverseMethod(int []limit){
      int []reverse=new int[limit.length];
      int i=0;
      int j=0;
      for (i=0,j=limit.length-1;i<limit.length;i++,j--){
          reverse[i]=limit[j];
          System.out.println(reverse[i]);
      }
        System.out.println(Arrays.toString(reverse));       // print the reversed array as a String

    }


    public static void main(String[] args) {
        reverseMethod(new int[]{1,2,4,9,15,23,30});
    }
}
