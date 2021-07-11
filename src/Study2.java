import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Study2 {
    public static void main(String[]args){
        reverseSentense("Crate and Barrel Test");
    }



    public static void reverseSentense(String sent){
        StringBuilder sb=new StringBuilder(sent);
        sb.reverse();

        char temp='a';
        for(int i=0;i<=(sb.length()-1)/2;i++){
            temp=sb.charAt(i);
            //sb.charAt(i)=sb.charAt(sb.length()-1);
            //sb.charAt(length()-1)=temp;
        }
        System.out.println(sb);
    }

}
