package mathmethods;

public class OddNumbers {
    /*
    Please find the odd numbers in between two numbers.
    Odd number is the number when divided by two and the remainder must be 1.
    We use % operator for finding the even/odd number.
     */
    public static void findOddNumbers(int a, int b){
        for(int i=a;i<=b;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    /*
     You can call the findEvenNumbers(int a, int b) method and pass two arguments
     */
    public static void main(String[] args) {
        findOddNumbers(12,200);
    }
}
