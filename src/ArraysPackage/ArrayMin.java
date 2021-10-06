package ArraysPackage;

public class ArrayMin {
    public static void main(String[] args) {
        smallestMethod(new int[]{5, 7, 9, 11, 56, 78});
    }


    public static void smallestMethod(int[] numbers) {
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
    }

    public void smallestMethod2(int[] num) {
        int smallest = num[0];
        int i = 0;
        for (i = 1; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println(smallest);
    }

    public static void smallestMethod3(int[] num) {
        int smallest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println(smallest);
    }


}
