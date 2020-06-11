package Strings;
import java.util.Scanner;
public class ReverseString5 {
    public static void reverseString(){
        String reversed="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your string");
        String str=scanner.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        reverseString();
    }
}
