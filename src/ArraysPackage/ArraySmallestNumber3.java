package ArraysPackage;

public class ArraySmallestNumber3 {
    public static void smallestArrayMethod(int [] num){
        int smallest=num[0];

        for(int i=1;i<num.length;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        smallestArrayMethod(new int[]{12,23,34,5,45,546});
    }
}
