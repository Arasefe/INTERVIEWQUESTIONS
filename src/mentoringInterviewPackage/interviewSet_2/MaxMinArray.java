package mentoringInterviewPackage.interviewSet_2;

public class MaxMinArray {
    //9.Store 10 random numbers into an Array then find the max and min

    public static void main(String[] args) {
        maxMinElements(new int[]{1,4,21,65,3});
    }

    public static void maxMinElements(int []array){

        int min=Integer.MAX_VALUE;


        for(int each:array){
            if(each<min){
                min=each;
            }

        }
        int max=Integer.MIN_VALUE;
        for(int each:array){
            if(each>max){
                max=each;
            }
        }
        System.out.println("The max is "+max+" and the min is "+min);
    }
}
