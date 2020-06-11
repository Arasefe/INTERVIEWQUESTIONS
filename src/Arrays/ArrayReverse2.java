package Arrays;

import java.util.Arrays;

public class ArrayReverse2 {
    public static void reverseMethod(int []limit){
      int []reverse=new int[limit.length];
      int i=0;
      int j=0;
      for (i=0,j=limit.length-1;i<limit.length;i++,j--){
          reverse[i]=limit[j];
          System.out.println(reverse[i]);
      }
        System.out.println(Arrays.toString(reverse));

    }


    public static void main(String[] args) {
        reverseMethod(new int[]{1,2,4,9,15,23,30});
    }
}
