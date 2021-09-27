package interviewPrep;

public class SecondMaxMin {
    public static void main(String[] args) {
        secondMax(new int[]{1,2,324,123,12,42});
        secondMin(new int[]{1,2,324,123,12,42});
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
        System.out.println(secondMax);
    }

    public static void secondMin(int[]numbers){

        int min = Integer.MAX_VALUE;
        int secondMin = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                secondMin = min;
                min = numbers[i];
            } else if (numbers[i] < secondMin) {
                secondMin = numbers[i];
            }

        }
        System.out.println(secondMin);
    }
}
