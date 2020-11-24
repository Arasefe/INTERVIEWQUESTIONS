package recursion;

public class StringReverse1 {

    public static void main(String[] args) {
        System.out.println(reverse("Aras Efe"));
    }

    public static String reverse(String str) {
        if (str.isEmpty()){
            return str;
        }

        return reverse((str).substring(1)) + str.charAt(0);
    }


    public static String reverse2(String str){
        if(str.isEmpty()){
            return str;
        }
       return reverse2(str.substring(1)+str.charAt(0));
    }


}
