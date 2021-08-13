package interviewPrep;

public class _21DivisibleBy3_5_15 {
    /*
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

    if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibleBy15' section

    if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3' section

    if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5' section
     */

    public static void main(String[] args) {
        divisibleBy3_5_15();
    }

    public static void divisibleBy3_5_15(){
        String result1="DivisibleBy15: ";
        String result2="DivisibleBy3Not15: ";
        String result3="DivisibleBy5Not15: ";
        String result4="Others : ";

        for (int i = 1; i <=100 ; i++) {
            if(i%3==0&&i%5==0&&i%15==0){
                result1+=i+" ";
            }else if(i%3==0&& i%15!=0){
                result2+=i+" ";
            }else if(i%5==0&& i%15!=0){
                result3+=i+" ";
            }else{
                result4+=i+" ";
            }
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
    public static void divisible_by_3_5_15(int i){

    }
}
