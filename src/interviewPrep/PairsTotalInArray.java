package interviewPrep;

public class PairsTotalInArray {
    public static void main(String[] args) {
        // From a given int array find all pairs whose total is  given number

        totalPairFromArray(new int[]{1,2,3,4,5,6,7,8,9},9);


    }

    private static void totalPairFromArray(int[] arr, int num) {
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
