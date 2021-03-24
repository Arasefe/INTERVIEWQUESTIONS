package ArraysPackage;

public class ArrayEqualPartitions {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 5, 6, 4};
        arrayEquals(arr);
    }

    public static void arrayEquals(int[] arr) {
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < (arr.length - 1) / 2; i++) {
            firstSum += arr[i];
        }
        for (int j = (arr.length - 1) / 2; j < arr.length; j++) {
            secondSum += arr[j];
            if (firstSum == secondSum) {
                return;
            }
        }
    }
}
