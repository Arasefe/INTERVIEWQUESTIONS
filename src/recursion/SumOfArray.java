package recursion;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1,2,3,4,5},5));
    }

    public static int sumOfArray(int[]nums,int N){
        if(N==0){
            return 0;
        }
        return (sumOfArray(nums,N-1)+nums[N-1]);
    }
}
