package interviewPrep;

public class ArrayPairs {
    /*
	  From a given array find all pairs whose sum is a given number
	  {4, 6, 5, -10, 8, 5, 20} ==> 10
	  For example;	4+6=10, 5+5=10, -10+20=10
	 */
    public static void main(String[] args) {
        totalPairInArray1(new int[]{1,3,5,4,6,7,8,9},12);
    }

    public static void totalPairInArray1(int arr[], int num) {
        int counter=0;
        for(int i=0; i<arr.length; i++) {

            for(int j=i+1; j<arr.length; j++) {

                if(arr[i]+arr[j]==num) {
                    counter++;
                    System.out.println("Iteration: "+counter+"->"+arr[i] + " + " + arr[j] + " = " + num );
                }

            }

        }
    }

    private static void totalPairInArray2(int[] arr, int num) {
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + "+" + arr[j] + " = " + num);
                    counter++;
                }
            }
        }
        if(counter==0){
            System.out.println("There is no pair equals the num");
        }
    }
}
