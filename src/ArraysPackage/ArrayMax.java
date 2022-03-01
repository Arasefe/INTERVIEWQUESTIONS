package ArraysPackage;

public class ArrayMax {

    public static void main(String[] args) {


//        findMax1(new int[]{2,3,6,8,5,-13,26,-123});
//        findMax2(new int[]{2,3,6,8,5,-13,26,-123});
        findMax3(new int[]{2,3,6,8,5,-13,26,-123});

    }

    public static void findMax1(int[]nums){
        /*
        Create a method it will take one parameter as an int array and
        the method will return max value from the array.
        (Use max value without using sort method)
         */
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
          if(nums[i]>max){
              max=nums[i];
          }
        }
        System.out.println(max);

    }

    public static void findMax2(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
    }

    public static void findMax3(int ...num){
            int temp=0;
            for(int i=0;i<num.length;i++){
                for (int j = i+1; j <num.length ; j++) {
                    if(num[i]>num[j]){
                        temp=num[i];
                        num[i]=num[j];
                        num[j]=temp;
                    }
                }

            }
            System.out.println(num[num.length-1]);
        }
    }
