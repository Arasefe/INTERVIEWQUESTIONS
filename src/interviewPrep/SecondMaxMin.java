package interviewPrep;

public class SecondMaxMin {
    public static void main(String[] args) {
//        secondMax(new int[]{1,2,324,123,12,42});
//        secondMin(new int[]{1,2,324,123,12,42});
        secondMin2(new int[]{1,2,324,123,12,42});
    }

    public static void secondMax(int[]numbers){

        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax) {
                secondMax = numbers[i];
            }

        }
        System.out.println("Second Max: "+secondMax);
        System.out.println("Max: "+max);
    }

    public static void secondMin(int[]numbers){         //4,6,8,2,1,9

        int min = Integer.MAX_VALUE;                    // 2B
        int secondMin = 0;                              // 0
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                secondMin = min;                        // secMin 2B
                min = numbers[i];                       // min     4
            } else if (numbers[i] < secondMin) {
                secondMin = numbers[i];                 // secMin 6
            }

        }
        System.out.println("Second Min: "+secondMin);
        System.out.println("Min: "+min);
    }

    public static void secondMin2(int[]numbers){

        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }

        }
        System.out.println("Second Min: "+numbers[1]);
        System.out.println("Min: "+numbers[0]);
    }

}
