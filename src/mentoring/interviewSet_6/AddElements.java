package mentoring.interviewSet_6;
// addElements() accepts 2 int arrays and adds each element value of two arrays and returns a 	new array.
// You can assume that each array has 5 elements.
// EX : addElements(new int[][10,40,50,3], new int[][11,0,500,44]); --> [21,40,550,47]

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        addElements(new int[]{10,40,50,3}, new int[]{11,0,500,44});
    }

    public static void addElements(int[]num1, int []num2){
        int[]added=new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            added[i]=num1[i]+num2[i];
        }
        System.out.println(Arrays.toString(added));
    }
}
