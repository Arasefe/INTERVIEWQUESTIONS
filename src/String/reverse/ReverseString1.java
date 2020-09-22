package String.reverse;

public class ReverseString1 {
    public static void main(String[] args) {
        reverse1("Aras");
        String a=reverse2("Tulpar");
        System.out.println(a);
        reverse3("Aras Tulpar");



    }
    public static void reverse1(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=""+str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String reverse2(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }

        return reverse;
    }

    public static void reverse3(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
