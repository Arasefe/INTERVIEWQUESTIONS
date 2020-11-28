package cybertek_interviewPrep;

public class _4RemoveDuplicates {

    public static void main(String[] args) {

        String result=removeDuplicates1("missing");
        System.out.println(result);

        removeDuplicates2("missing");

    }
    public static String removeDuplicates1(String str){
        String nonDup="";
        for(int i=0;i<str.length();i++){
            if(!nonDup.contains(str.charAt(i)+"")) nonDup+=str.charAt(i);
        }
        return nonDup;
    }

    public static void removeDuplicates2(String str){
        String nonDup="";
        for(int i=0;i<str.length();i++){
            if(!nonDup.contains(str.charAt(i)+"")) nonDup+=str.charAt(i);
        }
        System.out.println(nonDup);
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
