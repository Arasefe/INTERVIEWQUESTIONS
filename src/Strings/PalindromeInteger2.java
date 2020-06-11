package Strings;

public class PalindromeInteger2 {
    public static boolean isNumberPalindrome1(int num){
        int original=num;                                       // 91098
        int reversedNum=0;

        while( num>0){
            int digit=num%10;
            num=num/10;
            reversedNum=reversedNum*10+digit;                   //Onemli
        }
        if(reversedNum==original){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumberPalindrome1(345678));
    }
}
