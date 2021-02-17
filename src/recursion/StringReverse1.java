package recursion;

public class StringReverse1 {

    public static void main(String[] args) {
        System.out.println(reverse1("Aras Efe"));
        //System.out.println(reverse2("Aras Efe"));
    }

    public static String reverse1(String str) {
        if (str.isEmpty()){
            return str;
        }

        return reverse1((str).substring(1)) + str.charAt(0);
    }


    public static String reverse2(String str){
        if(str.isEmpty()){
            return str;
        }
       return reverse2((str).substring(1))+str.charAt(0);
    }


}
