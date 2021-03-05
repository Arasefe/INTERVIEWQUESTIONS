package ArraysPackage;

public class ArrayLargest3 {

    public static void main(String[] args) {
        int []num=new int[]{2,3,4,5,8,43,32,54};
        arrayLargestMethod(num);
    }

    public static void arrayLargestMethod(int []num){
        int largest=num[0];

        for(int i=1;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        System.out.println(largest);

    }


}
