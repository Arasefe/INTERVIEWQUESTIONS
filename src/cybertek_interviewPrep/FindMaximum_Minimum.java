package cybertek_interviewPrep;

import java.util.Arrays;

public class FindMaximum_Minimum {
    public static void main(String[] args) {
        minMax(new int[]{1,2,32,12,34,5,-12,-345});
    }
    public static void minMax(int []array){
        int min=Integer.MAX_VALUE;

        for(int each:array){
            if(each<min){
                min=each;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int num:array){
            if(num>max){
                max=num;
            }
        }

        System.out.println("Min= "+min+" max="+max);
    }
}
