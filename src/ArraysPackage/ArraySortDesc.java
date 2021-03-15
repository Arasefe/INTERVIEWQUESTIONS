package ArraysPackage;

import java.util.Arrays;

public class ArraySortDesc {


    public static void main(String[] args) {
        int []nums={12,2,34,54,23,4,67,82,17};
        sortDesc1(nums);
        sortDesc2(nums);
        sortDesc3(nums);
        sortDesc4(nums);

    }

    public static void sortDesc1(int[]nums){

        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]) {
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            //  System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void sortDesc2(int[]numbers){
        int temp=0;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if(numbers[i]<numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortDesc3(int[]numbers){
        int temp=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j]>numbers[i]){
                    temp=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortDesc4(int[]numbers){
        int temp=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]<numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=numbers[i];
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

