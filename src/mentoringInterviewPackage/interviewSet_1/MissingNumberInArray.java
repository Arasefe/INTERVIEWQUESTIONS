package mentoringInterviewPackage.interviewSet_1;


import java.util.Arrays;

public class MissingNumberInArray {
    //8.Write a method that takes an array of integers between 1 and 10 (excluding one number)
    // and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

    public static void main(String[] args) {
        missingNumber(new int[]{1,2,3,4,6,7,8});
    }

    public static int missingNumber(int[]array){
        Arrays.sort(array);

        if(array[array.length - 1] != 10)
            return 10;


        for(int i = 0; i< array.length - 1; i++) {
            if(array[i] + 1 != array[i + 1])
                return array[i] + 1;
        }
        return 1;

    }

}
