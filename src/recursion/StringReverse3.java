package recursion;

public class StringReverse3 {
    public static void main(String[] args) {
        System.out.println(reverseString("Toomanycooksspoilthebroth"));
    }

    public static String reverseString(String str){
        if(str.length()<1){
            return "";
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
}
