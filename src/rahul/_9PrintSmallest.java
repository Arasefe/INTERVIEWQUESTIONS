package rahul;

public class _9PrintSmallest {
    public static void main(String[] args) {
        printSmallest(new int[][]{{1,2,32,5},{12,23,21,34},{43,21,23,121}});
    }


    public static void printSmallest(int[][]arr){


        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
            System.out.println(min);
        }
    }
}
