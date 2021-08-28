package interviewPrep;

public class FindMaxMin {
    public static void main(String[] args) {
        //minMax1(new int[]{1,2,32,12,34,5,-12,-345});
        minMax2(new int[]{1,2,32,12,34,5,-12,-345});
    }
    public static void minMax1(int []array){
        int min=Integer.MAX_VALUE;

        for(int each:array){
            if(each<min){
                min=each;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int num:array){
            if(num>max){
                max=num;
            }
        }

        System.out.println("Min= "+min+" max="+max);
    }

    public static void minMax2(int[]array){
        int min=Integer.MAX_VALUE;
        for (int each : array) {
            if(each<min){
                min=each;
            }
        }
        System.out.println(min);
        int max=Integer.MIN_VALUE;
        for (int each : array) {
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);
    }
}
