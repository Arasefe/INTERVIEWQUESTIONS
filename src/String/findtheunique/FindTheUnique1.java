package String.findtheunique;
/*
String -- Find the unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class FindTheUnique1 {
    public static void main(String[] args) {
        findTheUnique1("AAABBBCCCDEF");
        String str=findTheUnique2("JDASDAKSDAHAD");
        System.out.println(str);

    }
    public static void findTheUnique1(String str){
        String uniques="";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)) count++;
            }
            if(count==1){
                uniques+=str.charAt(i);
            }
        }
        System.out.println(uniques);
    }

    public static  String findTheUnique2(String str){
        String uniques="";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)) count++;
            }
            if(count==1) uniques+=str.charAt(i);
        }

        return uniques;
    }

}
