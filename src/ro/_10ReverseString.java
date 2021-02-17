package ro;

public class _10ReverseString {
    public static void main(String[] args) {
        //reverseString1("Aras");
        String str=reverseString2("Aras");
        System.out.println(str);
    }
    public static void reverseString1(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String reverseString2(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverseString2(str.substring(1)+str.charAt(0));      //rasA
    }
}
