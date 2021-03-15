package ArraysPackage;

public class ArrayLargest1 {

    public static void main(String[] args) {

        //arrayLargest1(new int[]{2,3,6,8,5});
        arrayLargest2(new int[]{2,3,6,8,5});
        arrayLargest3(new int[]{2,3,6,8,5});
        arrayLargest4(new int[]{2,3,6,8,5});

    }

    public static void arrayLargest1(int[]nums){
        /*
        Create a method it will take one parameter as an int array and
        the method will return largest value from the array.
        (Use largest value without using sort method)
         */
        int largest=nums[0];

        for(int i=1;i<nums.length;i++){
          if(nums[i]>largest){
              largest=nums[i];
          }
        }
        System.out.println(largest);

    }

    public static int arrayLargest2(int[]arr){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void arrayLargest3(int[]arr){
        int largest=arr[0];
        //2,3,6,8,5
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }


    public static void arrayLargest4(int ...num){
            int largest=num[0];
            for(int i=1;i<num.length;i++){
                if(num[i]>largest){
                    largest=num[i];
                }
            }
            System.out.println(largest);
        }
    }
