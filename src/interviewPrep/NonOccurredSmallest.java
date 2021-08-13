package interviewPrep;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NonOccurredSmallest {
    /*
    Write a function that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
    Given A = [1, 2, 3], the function should return 4.
    Given A = [−1, −3], the function should return 1.
    Write an efficient algorithm for the following assumptions:
    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].
     */

    public static void main(String[] args) {
        //int result = nonOccurredSmallestElement1(new int[]{-3,-1});
        //System.out.println(result);
        nonOccurredSmallestElement2(new int[]{1,3,5,4});
    }

    public static int nonOccurredSmallestElement1(int[] A) {
        // Returns positive integer not occurring in an array of integers
        Set<Integer> set = new HashSet<>();
        for (int each : A) {
            if (each > 0) {
                set.add(each);
            }
        }
        System.out.println(set);
        int result = 0;
        for (int i = 1; i <= A.length+ 1; i++) {
            if (!set.contains(i)) {
                result = i;
                break;
            }
        }
        return result;
    }


    public static void nonOccurredSmallestElement2(int []arr){
        Set<Integer>uniques=new TreeSet<>();
        for (int each : arr) {
            if(each>0){
                uniques.add(each);
            }
        }
        int result=0;
        for (int i = 1; i <= arr.length+1; i++) {
            if(!uniques.contains(i)){
                result= i;
            }
        }
        System.out.println(result);
    }

    public static void nonOccurredSmallestElement3(int []arr){
        Set<Integer> uniques=new LinkedHashSet<>();
        for (int each : arr) {
            if(each>0){
                uniques.add(each);
            }
        }
        int result=0;
        for (int i = 1; i <= arr.length+1; i++) {
            if(!uniques.contains(i)){
                result= i;
            }
        }
        System.out.println(result);
    }

}
