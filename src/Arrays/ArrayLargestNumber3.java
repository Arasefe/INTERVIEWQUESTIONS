package Arrays;

public class ArrayLargestNumber3 {
    public static void arrayLargestMethod(int []num){
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
        int []num=new int[]{2,3,4,5,8,43,32,54};
        arrayLargestMethod(num);
    }
}
