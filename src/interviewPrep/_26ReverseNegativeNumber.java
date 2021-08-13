package interviewPrep;

public class _26ReverseNegativeNumber {
    /*
    Write a return method that can reverse negative number and return it as int
     */

    public static void main(String[] args) {
//        System.out.println(reverseNegativeNumber(-729));
//        System.out.println(reverseNegativeNumber2(-729));
        System.out.println(reverseNegativeNumber3(-729));
    }
    public static int reverseNegativeNumber(int num){
        String strNum="";
        if(num<0){
            num=num*-1;
            strNum+=num;
        }



        String reverseNum="";
        for (int i = strNum.length()-1; i >=0 ; i--) {
            reverseNum+=strNum.charAt(i);
        }
        //int result= Integer.valueOf(reverseNum);
        int result=Integer.parseInt(reverseNum);
        return result;
    }

    public static int reverseNegativeNumber2(int num){
        StringBuilder sb=new StringBuilder(num+"");
        String str=sb.reverse().toString();
        str=str.substring(0,str.length()-1);
        int result=Integer.parseInt(str);
        return result;

    }


    public static int reverseNegativeNumber3(int num){
        int reverse=0;
        if(num<0){
            num=num*-1;
        }

        while(num!=0){
            int digit=num%10;       // 9
            reverse=reverse*10+digit;
            num=num/10;

        }
        return reverse;
    }

}
