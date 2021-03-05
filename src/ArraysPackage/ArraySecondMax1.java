package ArraysPackage;

public class ArraySecondMax1 {

    public static void main(String[] args) {
        //secondHighest1(new int[]{1,2,3,4,5,6});
        secondHighest2(new int[]{1,2,3,4,5,6});

    }

    public static void secondHighest1(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }
        System.out.println(secondHighest);
    }

    public static void secondHighest2(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int each : arr) {
            if(each>highest){
                highest=each;
        }
            for (int i : arr) {
                if(i>secondHighest && i<highest){
                    secondHighest=i;
                }
            }

        }
        System.out.println(secondHighest);
    }


    public static void secondMaxNumber(int[]arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
