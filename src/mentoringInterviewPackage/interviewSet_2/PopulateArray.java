package mentoringInterviewPackage.interviewSet_2;

import java.util.Arrays;

public class PopulateArray {
    // 8.Populate method accepts an empty int array and populates it with numbers counting up.
    // EX : populate(new int[3])  ---> returns:[1,2,3]
    public static void main(String[] args) {
        int[]array1=new int[3];
        int[]array2=new int[5];
        arrayPopulate1(array1);
        arrayPopulate2(array2);
    }


    public static void arrayPopulate1(int[]array){

        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void arrayPopulate2(int[]array){
        for (int i = 0; i <array.length; i++) {
            array[i]=(i*2)-1;
        }
        System.out.println(Arrays.toString(array));
    }
}
