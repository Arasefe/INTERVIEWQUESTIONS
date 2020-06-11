package Arrays;

public class ArraySmallestNumber1 {
    public static void smallestMethod(int[]numbers){
        int smallest=numbers[0];
        int i=0;
        for(i=1;i<numbers.length-1;i++){
            if(smallest>numbers[i]){
                numbers[i]=smallest;
            }
        }
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        smallestMethod(new int[]{5,7,9,11,56,78});
    }
}
