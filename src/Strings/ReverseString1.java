package Strings;

public class ReverseString1 {
    public static void main(String[] args) {
        String a="Techtorial";

        String str="";
        for (int i=a.length()-1;i>=0;i--){
            str=str+a.charAt(i);
        }
        System.out.println(str);
    }
}
