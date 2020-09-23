package ArraysPackage;

public class TwoDimensionalArrays {
    public static void twoDimensionalArray() {
        int[][] numbers = {{1, 2, 3}, {6, 5, 4}};
        int[][] reversed = new int[3][3];
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers[i].length; k++) {
                System.out.println(numbers[i][k]);

                    }
                }
            }

    public static void main(String[] args) {
        twoDimensionalArray();
    }
}
