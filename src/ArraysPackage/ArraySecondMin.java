package ArraysPackage;


public class ArraySecondMin {
    public static void main(String[] args) {

        secondMin(new int[]{1, 2, 3, 4, 5, 6});
    }

    public static void secondMin(int[] arr) {       // 1, 2, 3, 4, 5, 6
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secMin = min;                       // Integer.MAX_VALUE
                min = arr[i];                       // 1
            } else if (arr[i] < secMin) {
                secMin = arr[i];                    // 2
            }
        }
        System.out.println(secMin);
    }

    public static void secondMin1(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int each : arr) {
            if (each < min) {
                secondMin = min;
                min = each;
            } else if (each < secondMin) {
                secondMin = each;
            }
        }
        System.out.println(secondMin);
    }


    public static void secondMin2(int[] elements) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min)
                min = elements[i];
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < secondMin && elements[i] > min)
                secondMin = elements[i];

        }

        System.out.println("The smallest element is: " + min +  " and the second smallest element is: " + secondMin);
    }


    public static void secondMin3(int []arr){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for ( int each : arr) {
            if(each<smallest){
                smallest=each;
            }
        }

        for (int i : arr) {
            if(i<secondSmallest && i>smallest){
                secondSmallest=i;
            }
        }

        System.out.println("Smallest "+smallest +" Second Smallest "+secondSmallest);
    }


    public static void secondMin4(int[]numbers){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<secondSmallest && numbers[i]>smallest){
                secondSmallest=numbers[i];
            }
        }
        System.out.println(secondSmallest);
    }






}

