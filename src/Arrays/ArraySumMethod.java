package Arrays;

public class ArraySumMethod {
    public static void main(String[] args) {
        int sum=0;
        int []numbers=new int[]{1,2,3,4,5,6,7,8,9,11,13,15,17};
        for (int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        System.out.println("The sum of the Array elements is " + sum);
    }
}
