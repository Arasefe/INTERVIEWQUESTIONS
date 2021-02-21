package ro;

public class _13ReverseNumber {
    public static void main(String[] args) {
        reverseNumber1(234);
        reverseNumber2(853);
    }

    public static void reverseNumber1(int num){
        String reverse="";
        while(num!=0){
            int digit=num%10;
            reverse+=digit;
            num/=10;
        }
        System.out.println(Integer.valueOf(reverse));

    }

    public static void reverseNumber2(int num){
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=digit+reverse*10;
            num/=10;
        }
        System.out.println(reverse);

    }
}
