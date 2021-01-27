package cybertek_interviewPrep;

public class _34SecondMaxNumber {
    public static void main(String[] args) {
        secondMaxNumber(new int[]{1,242,35,56,6897});
    }

    public static void secondMaxNumber(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

    }
}
