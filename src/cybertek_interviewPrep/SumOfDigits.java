package cybertek_interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        sumOfDigitsInString("dhsd239dsk4nknq6");
        sumOfDigitsInString1("2ssdk8knsdnk3");

    }
    public static void sumOfDigitsInString(String str){
        String [] array=str.split("");
        String numeric="";
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=48&&str.charAt(i)<=57){
                numeric+=str.charAt(i);
                num+=Integer.parseInt(str.charAt(i)+"");
            }
        }

        System.out.println("Numeric String is  " + numeric);
        System.out.println("Sum = " + num);
    }

    public static void sumOfDigitsInString1(String str){
        char[]ch=str.toCharArray();

        int Sum=0;
        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])){

                Sum+=Integer.parseInt(ch[i]+"");
            }
        }
        System.out.println("sum = " + Sum);
    }
}
