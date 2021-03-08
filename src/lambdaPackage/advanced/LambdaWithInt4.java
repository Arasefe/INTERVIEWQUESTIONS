package lambdaPackage.advanced;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LambdaWithInt4 {
    public LambdaWithInt4(){}

    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();

        list.addAll(Arrays.asList(12,23,32,1,100));


    }
    public static boolean checkSum(List<Integer>list){
        int sum=0;
        for (int i = 0; i < list.size()-1; i++) {
            sum+=list.get(i);
        }
        return list.get(list.size()-1)==sum;
    }


    public static boolean checker(List<Integer>list){
//        return list.stream().filter();
        return true;
    }

}
