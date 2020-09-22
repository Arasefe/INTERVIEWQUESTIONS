package String.removeduplicates;
/*
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        removeDuplicates("sdknshkdhksdks");
    }
    public static void removeDuplicates(String str){
        String nonDup="";
        for(int i=0;i<str.length();i++){
            if(nonDup.contains(str.charAt(i)+"")){
                continue;
            }else{
                nonDup+=str.charAt(i);
            }
        }
        System.out.println(nonDup);

    }
}
