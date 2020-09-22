package interviewSet_1;

public class Remainder {
    //10.Can you write a method which finds remainder of 2 numbers without using the % operator?

    public static void main(String[] args) {
       int remainder= remainder(2,3);
        System.out.println(remainder);

    }

    public static int remainder(int dividend, int divisor ){
        int remainder=0;
        if(dividend<divisor){
            return divisor;
        }else{
            remainder=dividend-divisor*(dividend/divisor);
        }
        return remainder;
    }

}
