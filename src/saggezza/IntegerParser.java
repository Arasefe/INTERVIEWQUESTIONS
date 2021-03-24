package saggezza;

public class IntegerParser {

    /*
     * Parse an input String into an integer(int) value. In essence, you have to
     * implement the Integer.valueOf(String) static method.
     * Consider augmenting your test cases below to include more scenarios
     */

    public static void main(String[] args) {
        System.out.println(integerParser("12"));
    }

    public static int integerParser(String str){
        if(str.equals("")){
           return 0;
        }
        int a=Integer.valueOf(str);
        int b=Integer.parseInt(str);
        return a+b;
    }

}
