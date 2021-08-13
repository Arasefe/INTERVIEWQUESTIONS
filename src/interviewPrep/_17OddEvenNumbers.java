package interviewPrep;

public class _17OddEvenNumbers {

    public static void main(String[] args) {
        oddEven(new int[]{2,3,4,5});
    }

    public static void oddEven(int [] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.println(array[i]+" is even number");
            }
            if(array[i]%2!=0){
                System.out.println(array[i]+" is odd number");
            }
        }
    }
}
