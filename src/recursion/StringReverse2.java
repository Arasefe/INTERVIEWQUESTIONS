package recursion;

public class StringReverse2 {
    public static void main(String[] args) {
        System.out.println(reverseString("ismail YILDIRIM"));

        reverseString1("Tulpar");

    }

    public static String reverseString(String word){
        if(word.isEmpty()){
            return word;
        }
        return reverseString((word).substring(1))+word.charAt(0);
    }

    public static void reverseString1(String str){
        String [] strArray=str.split("");
        String [] newStr=new String[strArray.length];
        int i= strArray.length-1;
        for(String each:strArray){
            newStr[i]=each;
            i--;
        }
        String reversed="";
        for(String each:newStr){
            reversed+=each;
        }
        System.out.println("Reversed String is "+reversed);
    }
}
