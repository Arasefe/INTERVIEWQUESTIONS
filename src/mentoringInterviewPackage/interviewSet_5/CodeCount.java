package mentoringInterviewPackage.interviewSet_5;

public class CodeCount {
    // Print out the number of times that the string "code" appears anywhere in the given string.
    // We'll accept any letter for the 'd', so "cope", "core" and "cooe" count.
    public static void main(String[] args) {
        codeCount("codesdcodefkcode");
    }

    public static void codeCount(String str){
        int count=0;
        for (int i = 0; i < str.length()-3; i++) {

                if(str.substring(i,i+2).equals("co")&&str.charAt(3)==('e')){
                    count++;
                }

        }
        System.out.println(count);
    }

}
