package ArraysPackage;
import java.util.Arrays;
public class ArraySorting3 {
    public static void arraySorting(int...num){

        int temp=0;
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

    public static void main(String[] args) {
        arraySorting(12,13,23,34,35,45,46,56,57,87,89);
    }
}
