package ArraysPackage;

import java.util.Arrays;

public class ArrayReverse2D {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 5}, {6, 5, 4, 9}};
        twoDimensionalArray1(numbers);

    }


    public static void twoDimensionalArray1(int[][]numbers) {

        int temp=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= (numbers[i].length/2)-1; j++) {
                temp=numbers[i][j];
                numbers[i][j]=numbers[i][(numbers[i].length-1)-j];
                numbers[i][(numbers[i].length-1)-j]=temp;

            }
        }

        System.out.println(Arrays.deepToString(numbers));
    }
}
