package mentoring.interviewSet_5;

public class HiCount {
    //Print out the number of times that the string "hi" appears anywhere in the given string.
    public static void main(String[] args) {
        System.out.println(printHi("hiyhigghiffhi"));
    }

    public static int printHi(String word){
        int count=0;
        for (int i = 0; i <= word.length()-2; i++) {
            if(word.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }

}
