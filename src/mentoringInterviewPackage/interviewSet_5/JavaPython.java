package mentoringInterviewPackage.interviewSet_5;

public class JavaPython {
    // Given a string, print out true if the number of appearances of "java" anywhere in the string is
    // equal to the number of appearances of "python" anywhere in the string (case sensitive).
    public static void main(String[] args) {
        System.out.println(printTrue("javapythonjavapython"));
    }
    public static boolean printTrue(String word){
        int countJava=0;
        for (int i = 0; i <=word.length()-4 ; i++) {
            if(word.substring(i,i+4).equals("java")){
                countJava++;
            }
        }
        int countPython=0;
        for (int i = 0; i <=word.length()-6 ; i++) {
            if(word.substring(i,i+6).equals("python")){
                countPython++;
            }
        }
        if(countJava==countPython){
            return true;
        }
        return false;
    }
}
