package ArraysPackage;
import java.util.Arrays;
public class ArraySorting2 {
    public static void main(String[] args) {
        int [] num={12,32,2,34,45,67,89,675,17,3};
        int temp;
        for(int i=0;i<num.length;i++){
            for(int k=i+1;k<num.length;k++){
                if(num[i]>num[k]){
                    temp=num[i];
                    num[i]=num[k];
                    num[k]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
