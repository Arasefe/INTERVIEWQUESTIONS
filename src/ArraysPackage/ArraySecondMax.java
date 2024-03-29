package ArraysPackage;



public class ArraySecondMax {

    public static void main(String[] args) {
        //secondHighest1(new int[]{1,2,3,4,5,6});
        //secondHighest2(new int[]{1,2,3,4,5,6});
        //secondHighest3(new int[]{1,2,3,4,5,6});
        //secondHighest4(new int[]{1,2,3,4,5,6});
        secondHighest5(new int[]{1,2,3,4,5,6});

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


    public static void secondHighest3(int[]arr){
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


    public static void secondHighest4(int[]array){
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>highest){
                secondHighest=highest;
                highest=array[i];
            }else if(array[i]>secondHighest){
                secondHighest=array[i];
            }
        }
        System.out.println(secondHighest);
    }

    public static void secondHighest5(int[]array){
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for (int each :array) {
            if(each>highest){
                secondHighest=highest;
                highest=each;
            }else if(each>secondHighest){
                secondHighest=each;
            }
        }
        System.out.println(secondHighest);
    }
}
