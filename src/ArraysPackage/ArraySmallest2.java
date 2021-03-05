package ArraysPackage;

public class ArraySmallest2 {

    public static void main(String[] args) {
        ArraySmallest2 arr=new ArraySmallest2();
        arr.smallestArrayMethod(new int[]{12,23,34,45,1,2,29,56});
    }
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

}
