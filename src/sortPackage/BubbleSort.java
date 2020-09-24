package sortPackage;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(new int[]{20, 35, -15, 7, 55, 1, -22});
    }

    public static void bubbleSort(int[]intArray) {
        for (int lUIndex = intArray.length - 1; lUIndex > 0; lUIndex--) {
            for (int i = 0; i < lUIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
