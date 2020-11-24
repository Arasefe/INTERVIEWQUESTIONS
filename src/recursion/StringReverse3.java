package recursion;

public class StringReverse3 {
    public static void main(String[] args) {
        System.out.println(reverseString1("Toomanycooksspoilthebroth"));
        reverseString2("Toomanycooksspoilthebroth");
    }

    public static String reverseString1(String str){
        if(str.length()<1){
            return "";
        }
        return reverseString1(str.substring(1))+str.charAt(0);
    }


    public static String reverseString2(String str){
        if(str.isEmpty()){
           return str;
        }

        return reverseString2((str).substring(1))+str.charAt(0);
    }
}
