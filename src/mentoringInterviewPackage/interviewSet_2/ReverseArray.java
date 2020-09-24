package mentoringInterviewPackage.interviewSet_2;

import java.util.Arrays;

public class ReverseArray {
	//10.Reverse an array with two different ways
    public static void main(String[] args) {
        reverseArray(new int[]{1,2,3,4,5});
        reverseArray2(new String []{"1","2","3","4","5"});

    }


    public static void reverseArray(int[]array){
        int[]reversedArray=new int[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            reversedArray[j]=array[i];
            j++;
        }

        System.out.println(Arrays.toString(reversedArray));

    }

    public static void reverseArray2(String[]array){
        String str="";
        for (int i = 0; i < array.length; i++) {
            str+=array[i];
        }

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(str);

        String []strArray=str.split("");
        System.out.println(Arrays.toString(strArray));



    }

}
