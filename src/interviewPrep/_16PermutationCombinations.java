package interviewPrep;

import java.util.Arrays;

public class _16PermutationCombinations {


    public static void main(String[] args) {
        char[]ch=new char[]{'c','d','f'};
        permutationMethod1(ch);
    }

    public static void permutationMethod1(char[]ch){
        String[]arr=new String[ch.length*2];
        int idx=0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                arr[idx]=""+ch[i]+ch[j];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
