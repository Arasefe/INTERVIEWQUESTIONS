package ArraysPackage;

import java.util.Arrays;

public class ArraySorting5 {
    public static void sortSmallestLargest(){
        int []nums={12,2,34,54,23,4,67,82,17};
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]) {
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
          //  System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        sortSmallestLargest();
    }
}

