package ArraysPackage;

public class ArraySmallestNumber1 {
    public static void main(String[] args) {
        smallestMethod(new int[]{5,7,9,11,56,78});
    }


    public static void smallestMethod(int[]numbers){
        int smallest=numbers[0];

        for(int i=1;i<numbers.length-1;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println(smallest);
    }


}
