package String.frequencyofchars;
/*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */
public class FrequencyOfChars5 {
    public static void main(String[] args) {
        String result=frequencyOfChars("AAABBCDD");
        System.out.println(result);
    }

    public static String frequencyOfChars(String str){
        String nonDup="";
        for(int i=0;i<str.length();i++){
            if(!nonDup.contains(str.charAt(i)+"")) nonDup+=str.charAt(i);
        }
        String result="";

        for(int i=0;i<nonDup.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==nonDup.charAt(i)) count++;
            }
            result+=nonDup.charAt(i)+""+count;
        }
        //System.out.println(result);
        return result;
    }
}
