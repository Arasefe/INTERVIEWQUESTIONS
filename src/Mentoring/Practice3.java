package Mentoring;

public class Practice3 {
    /*
Create a method it will accept one int parameter and it will return product number of the given int value.
Given int value : 1258
Sum of the digit: 1+2+5+8
Multiplication of the digit: 1*2*5*8
Product Number : MultiplicationOfDigit - SumOfDigit;
     */
    public static void methodGetIntegers(int num){
        int sum=0;
        int multiply=1;
        int temp=num;
        int productNumber=0;

        while (num>0){              //123
            sum+=num%10;            //
            multiply*=num%10;
            num=num/10;
            productNumber=multiply-sum;
        }
        System.out.println("The sum of the digits "+ temp+" is" + sum);
        System.out.println("Multiplication of the digits" + temp + " is "+ multiply);
        System.out.println("Product number is "+ productNumber);

    }

    public static void main(String[] args) {
        methodGetIntegers(1234);
    }
}
