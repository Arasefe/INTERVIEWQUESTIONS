package ArraysPackage;

public class ArraySum {
    public static void main(String[] args) {
        int []numbers=new int[]{1,2,3,4,5,6,7,8,9,11,13,15,17};
        sumArray(numbers);
    }

    public static void sumArray(int[]numbers){
        int sum=0;

        for (int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        System.out.println("The sum of the Array elements is " + sum);
    }

    public static void sumArray2(int[]numbers){
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println("Sum of the Array elements is "+sum);
    }
}
