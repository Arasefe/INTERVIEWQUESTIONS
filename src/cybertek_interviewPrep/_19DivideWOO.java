package cybertek_interviewPrep;

public class _19DivideWOO {
    /*
    Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {
//        divideWOO1(13,3);
//        divideWOO2(13,3);
        divideWOO3(13,3);

    }

    public static void divideWOO1(int num1, int num2){
        if(num2==0){
            System.out.println("Invalid divisor");
            return;
        }
        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count = 0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }


    public static void divideWOO2(int a,int b) throws ArithmeticException{
        int count=0;
        if(b==0){
            throw new ArithmeticException("Invalid divisor");
        }else{

            while(a>=b){
                a-=b;
                count++;
            }
        }
        System.out.println("When a/b, the result is "+count+" and the remainder is "+a);
    }


    public static void divideWOO3(int x, int y){
        int counter=0;
        if (y==0){
            System.out.println("Invalid divisor");
            return;
        }else{
            while(x>=y){
                x-=y;
                ++counter;
            }
        }
        System.out.println("13/3 is "+counter+ " and the remainder is "+x);
    }
}
