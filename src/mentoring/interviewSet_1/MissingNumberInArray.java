package mentoring.interviewSet_1;


import java.util.Arrays;
import java.util.TreeSet;

public class MissingNumberInArray {
    // Write a method that takes an array of integers between 1 and 10 (excluding one number)
    // and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

    public static void main(String[] args) {
        //missingNumber1(new int[]{1,2,3,4,4,1,6,7,8});
        missingNumber2(new int[]{1,2,3,4,4,1,6,7,8});

    }

    public static void missingNumber1(int[]array){
        Arrays.sort(array);
        int totalNum=array[array.length-1];
        int expSum=(totalNum*(totalNum+1)/2);
        int sum=0;
        for (int each:array) {
            sum+=each;
        }
        System.out.println(expSum-sum);
    }

    public static void missingNumber2(int[]array){
        TreeSet<Integer>set=new TreeSet<Integer>();
        for (int each : array) {
            set.add(each);
        }
        System.out.println(set);

        int totalNum=array[array.length-1];
        int expSum=(totalNum*(totalNum+1)/2);
        int sum=0;
        for (Integer each : set) {
            sum+=each;
        }
        int missingInt=expSum-sum;
        System.out.println(missingInt);
    }
}
