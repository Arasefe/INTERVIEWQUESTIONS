package mentoringInterviewPackage.interviewSet_1;

public class FrequencyOfLetters {
    //5.Write a method which returns how many times each letter is repeated?

    public static void main(String[] args) {
        letterCount("asjbdsjakds");
    }



    public static void letterCount(String str){
        String nonDup="";
        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains(str.charAt(i)+"")){
                nonDup+=str.charAt(i);
            }
        }

        String result="";
        for (int i = 0; i < nonDup.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            result+=""+nonDup.charAt(i)+count;
        }
        System.out.println(result);

    }
}
