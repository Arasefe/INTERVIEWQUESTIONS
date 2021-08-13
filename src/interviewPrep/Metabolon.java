package interviewPrep;

public class Metabolon {

    public static void main(String[] args) {
        char[]chars=new char[]{'B','B','*','C','$','D','#','E','!','F'};
        reverse2("AB*C$D#E!F");
    }
    public static void reverse(String str){
        //AB*C$D#E!F
        str=str.replaceAll("\\p{Punct}", "");
        StringBuilder sb=new StringBuilder(str);
        String reverse="";
        for (int i= str.length()-1;i>=0; i--) {
            //String alpha=""+str.charAt(i);

            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){

                reverse+=str.charAt(i);
            }else{

            }
        }
        System.out.println(reverse);

    }

    public static void reverse2(String str) {


    }



}
