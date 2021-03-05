package mentoring.interviewSet_2;

public class ExtractNumbers {
    //6.Write a method that gets any number from a string it gets and returns the number string.
    // EX :extractNum("aa2aa3") ==> 23

    public static void main(String[] args) {
        extractNumber("aa2aa3");
        extractNumber1("aa2aa3");
    }

    public static void extractNumber(String str){

        String numeric="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=48 | str.charAt(i)<=57){
                numeric+=str.charAt(i);
            }
        }
        System.out.println("String numeric "+numeric);
        int a=Integer.parseInt(numeric);
        System.out.println("Numbers "+numeric);
    }

    public static void extractNumber1(String str){
        char[]ch=str.toCharArray();
        String letterStr="";
        String numericStr="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                letterStr+=str.charAt(i);
            }else{
                numericStr+=str.charAt(i);
            }
        }
        System.out.println(letterStr);

        System.out.println(numericStr);

        int result=Integer.parseInt(numericStr);
        System.out.println("Result is"+result+ " and result+3="+(result+3));

    }

}
