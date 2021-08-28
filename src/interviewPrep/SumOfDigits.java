package interviewPrep;

public class SumOfDigits {
    public static void main(String[] args) {

        sumOfDigits6("2ssdk8knsdnk3");

    }
    public static void sumOfDigits1(String str){
        String [] array=str.split("");
        String numeric="";
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=48&&str.charAt(i)<=57){
                numeric+=str.charAt(i);
                num+=Integer.parseInt(str.charAt(i)+"");
            }
        }

        System.out.println("Numeric String is  " + numeric);        //"2834843"
        System.out.println("Sum = " + num);
    }

    public static void sumOfDigits2(String str){
        char[]ch=str.toCharArray();

        int sum=0;
        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])){

                sum+=Integer.parseInt(ch[i]+"");
            }
        }
        System.out.println("sum = " + sum);
    }

    public static int sumOfDigits3(String str){
        char []ch=str.toCharArray();
        int sum=0;
        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])){
                sum+=Integer.parseInt(ch[i]+"");
            }
        }
        return sum;
    }

    public static int sumOfDigits4(String str){
        int sum=0;
        char []arr=str.toCharArray();
        for (char each : arr) {
            if(Character.isDigit(each)) sum+=Integer.parseInt(""+each);
        }
        return sum;
    }

    public static int sumOfDigits5(String str){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum+=str.charAt(i);
            }
        }
        return sum;
    }


    private static void sumOfDigits6(String str){
        // Regex replaces all alphabetic characters with ""
        str=str.replaceAll("\\p{Alpha}", "");
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            int each=Integer.parseInt(""+str.charAt(i));
            sum+=each;
        }

        System.out.println(sum);
    }

}
