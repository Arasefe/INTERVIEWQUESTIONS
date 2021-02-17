package ro;

public class _3MaxDiff {
    public static void main(String[] args) {
        maxDiffBetweenAdjacentInd(new int[]{1,2,23,1,32,43,53});
    }

    public static void maxDiffBetweenAdjacentInd(int[]arr){
        int diff=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]>diff){
                diff=arr[i+1]-arr[i];
            }
        }
        System.out.println(diff);
    }
}
