package mentoringInterviewPackage.interviewSet_3;

public class MinMaxArray {
    public static void main(String[] args) {
        maxMinArray(new int[]{1,2,3,565,64,342,-23,0});
    }
    public static void maxMinArray(int []array){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int each:array){
            if(each<min){
                min=each;
            }
            if(each>max){
                max=each;
            }
        }
        System.out.println("min is "+min);
        System.out.println("max is "+ max);
    }
}
