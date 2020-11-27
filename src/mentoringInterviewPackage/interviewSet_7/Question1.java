package mentoringInterviewPackage.interviewSet_7;

public class Question1 {
    public static void main(String[] args) {
        /*
        1.Write a method appearsTwice() that returns true
         if value of variable target appears only twice in the string sentence,
         otherwise return false.
         EX : appearsTwice("java", "java is fun!")- returns false
        */
        System.out.println(appearsTwice("java", "java is fun java!"));


    }

    public static boolean appearsTwice(String target, String sentence){
        int count=0;
        for (int i = 0; i < sentence.length()-target.length(); i+=target.length()) {
            if(sentence.substring(i,i+target.length()).equals(target)){
                count++;
            }
        }
        if(count==2) return true;

        else{
            return false;
        }
    }
}
