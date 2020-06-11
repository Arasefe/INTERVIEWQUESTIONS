package Arrays;

import java.util.Arrays;

public class ArraySorting4 {
    /*
Create a method it will take one parameter as a int array and the
method will return sorted array. (Do not use sort method.)
     */
    public static void sortMethod(int []nums){
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j =i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp=nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(nums));


    }

    public static void main(String[] args) {
        sortMethod(new int[]{34,23,4,56,12,45,667,78});
    }
}
