package sortPackage;

public class SelectionSort {
    public static void main(String[] args) {

    }

    public static void selectionSort() {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lUIndex = intArray.length - 1; lUIndex > 0; lUIndex--) {

            int largest = 0;

            for (int i = 1; i <= lUIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lUIndex);

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

