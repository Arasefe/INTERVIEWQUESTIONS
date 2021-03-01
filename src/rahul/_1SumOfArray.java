package rahul;

public class _1SumOfArray {
    public static void main(String[] args) {
        sumArray(new int[]{23,32,43,143,2});
    }
    public static void sumArray(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
