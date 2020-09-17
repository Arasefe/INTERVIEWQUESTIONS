package Arrays;

public class ArrayLargestNumber1 {
    public static int arrayLargestMethod(int[]nums){
        /*
        Create a method it will take one parameter as an int array and
        the method will return largest value from the array.
        (Use largest value without using sort method)
         */
        int largest=nums[0];
        int i=0;
        for( i=1;i<nums.length;i++){
          if(largest<nums[i]){
              largest=nums[i];
          }
        }
        System.out.println(largest);
        return largest;
    }

    public static void main(String[] args) {
        ArrayLargestNumber1 arr=new ArrayLargestNumber1();

        arrayLargestMethod(new int[]{2,3,6,8,5});
    }
}
