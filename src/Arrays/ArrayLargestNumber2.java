package Arrays;

public class ArrayLargestNumber2 {
    public void largestArrayMethod(int...num){
        int largest=num[0];
        int i=0;
        for(i=1;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        ArrayLargestNumber2 arr=new ArrayLargestNumber2();
        arr.largestArrayMethod(15,16,56,4,78,2,123,678,4,9);
    }
}
