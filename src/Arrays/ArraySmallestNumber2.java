package Arrays;

public class ArraySmallestNumber2 {
    public void smallestArrayMethod(int []num){
        int smallest=num[0];
        int i=0;
        for(i=1;i<num.length;i++){
           if(smallest>num[i]) {
               smallest=num[i];
           }
        }
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        ArraySmallestNumber2 arr=new ArraySmallestNumber2();
        arr.smallestArrayMethod(new int[]{12,23,34,45,1,2,29,56});
    }
}
