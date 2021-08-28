package interviewPrep;

import java.util.Arrays;

public class EquilizeArrayElement {
    public static void main(String[] args) {
        int result=equlizer2(new int[]{2, 3, 2, 4, 5});
        int result2=equlizer3(new int[]{2, 3, 2, 4, 5});
        System.out.println(result2);
    }



    public static int equlizer2(int[] nums) {

        if (nums.length < 2)
            return 0;
        int moves = 0;
        int diff = 0;
        int min = 0;
        int max = 0;
        int maxIX = 0;

        min = max = nums[0];
        maxIX = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIX = i;
            } else if (nums[i] < min)
                min = nums[i];
        }
        if (min != max) {
        }
        System.out.println(Arrays.toString(nums));
        return moves;
    }

    public static int equlizer3(int[]nums){
        // Sort in place. Assumed O(n log(n)) complexity
        Arrays.sort(nums);

        int moves = 0;
        int sum = 0;

        for(int i = 1; i < nums.length; ++i){
            // Difference between current and previous.
            int delta = (nums[i] - nums[i - 1]);

            // Add current delta to previous deltas
            sum += delta;

            // Triangular number, accumulate.
            moves += sum;
        }
        return moves;
    }

}

