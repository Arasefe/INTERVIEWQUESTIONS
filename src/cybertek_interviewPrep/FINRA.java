package cybertek_interviewPrep;

import java.util.Arrays;

public class FINRA {
    /*
    Write a method which prints out the numbers from 1 to 30
    but for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {
        //methodFinra();
        methodFINRA();
    }

    public static void methodFinra(){
        String FINRA="";
        for (int i = 1; i <=30; i++) {
            if(i%3==0&&i%5==0){
                FINRA+="FINRA";
            }else if(i%5==0){
                FINRA+="RA";
            }else if(i%3==0){
                FINRA+="FIN";
            }else{
                FINRA+=i;
            }
        }
        System.out.println(FINRA);
    }

    public static void methodFINRA(){
        String s="";
        for (int i = 1; i <=30 ; i++) {
            if(i%3==0&&i%5==0){
                s+="FINRA";
            }else if(i%5==0){
                s+="RA";
            }else if(i%3==0){
                s+="FIN";
            }else{
                s+=i;
            }
        }
        System.out.println(s);
    }
}
