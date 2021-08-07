package techproed.InterviewSet_Set1;

public class ReverseNumber {
    public static void main(String[] args) {
        //System.out.println(reverseNumber1(3467));
        System.out.println(reverseNumber2(3467));
    }

    private static int reverseNumber1(int num){
        String result="";
        String str=String.valueOf(num);
        if(num<0){
            str=str.substring(1);
            //result+="-";
        }
        result=new StringBuilder(str).reverse().toString();
        return Integer.parseInt(result);
    }

    private static int reverseNumber2(int num){

        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=digit+reverse*10;
            num/=10;
        }

        return reverse;
    }
}
