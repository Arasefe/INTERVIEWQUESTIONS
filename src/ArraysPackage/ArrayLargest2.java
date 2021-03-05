package ArraysPackage;

public class ArrayLargest2 {
    public static void main(String... aras) {

        largestArrayMethod(15,16,56,4,78,2,123,678,4,9);
    }

    public static void largestArrayMethod(int...num){
        int largest=num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println(largest);
    }


}
