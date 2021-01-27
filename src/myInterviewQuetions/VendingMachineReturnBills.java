package myInterviewQuetions;

public class VendingMachineReturnBills {
    public static void main(String[] args) {
        returnCoinBill(177);
    }

    public static void returnCoinBill(long num){
        long bill10=0;
        long bill5=0;
        long coin2=0;
        long remainder=0;
        if(num==1||num==3){
            System.out.println("null");
        }

        while(num!=0){
            remainder=num%10;                   //7

            if(remainder==1||remainder==3){
                System.out.println("null");
            }else if(remainder>5 && remainder%2!=0){

            }
            num=num/10;
            bill10=num;
            if(num<10){
                remainder=num%5;
                num=num/5;
                bill5=num;
            }else if(num<5){
                remainder=num%2;
                num=num/2;
                coin2=num;
            }
        }
        System.out.println(bill10);
        System.out.println(bill5);
        System.out.println(coin2);
    }
}
