package ArraysPackage;


public class ArraySecondMin {
    public static void main(String[] args) {
        //secondSmallest1(new int[]{1,2,3,4,5,6});
        //secondSmallest2(new int[]{1,2,3,4,5,6});
        //secondSmallest3(new int[]{1, 2, 3, 4, 5, 6});
        secondSmallest4(new int[]{1, 2, 3, 4, 5, 6});
        //secondSmallest5(new int[]{1, 2, 3, 4, 5, 6});
    }

    public static void secondSmallest1(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }

    public static void secondSmallest2(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int each : arr) {
            if (each < smallest) {
                secondSmallest = smallest;
                smallest = each;
            } else if (each < secondSmallest) {
                secondSmallest = each;
            }
        }
        System.out.println(secondSmallest);
    }


    public static void secondSmallest3(int[] elements) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < smallest)
                smallest = elements[i];
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < secondSmallest && elements[i] > smallest)
                secondSmallest = elements[i];

        }

        System.out.println("The smallest element is: " + smallest + "\n" + "The second smallest element is: " + secondSmallest);
    }


    public static void secondSmallest4(int []arr){
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


    public static void secondSmallest5(int[]numbers){
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

