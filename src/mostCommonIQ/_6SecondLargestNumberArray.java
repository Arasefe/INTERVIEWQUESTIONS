package mostCommonIQ;

import java.util.Arrays;

public class _6SecondLargestNumberArray {

    public static void main(String[] args) {
        secondLargestNumber(new int[]{12,3,243,43,6545,674});
    }
    public static void secondLargestNumber(int[]numbers){
        int max=Integer.MIN_VALUE;
        int second=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }

        }

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        System.out.println(max);
    }
}
