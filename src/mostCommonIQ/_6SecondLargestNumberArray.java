package mostCommonIQ;

public class _6SecondLargestNumberArray {

    public static void main(String[] args) {
        secondLargestNumber(new int[]{12, 3, 243, 43, 6545, 674});
    }

    public static void secondLargestNumber(int[] numbers) {
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
}
