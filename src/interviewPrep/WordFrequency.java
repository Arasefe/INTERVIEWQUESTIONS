package interviewPrep;

public class WordFrequency {
    public static void main(String[] args) {
        wordFrequency1("javaksdskdjavadkajava");
        wordFrequency2("javaksdskdjavadkajava");
    }
    public static void wordFrequency1(String str){
        int count=0;
        for (int i = 0; i <= str.length()-4; i++) {
            if(str.substring(i,i+4).equalsIgnoreCase("Java")){
                count++;
            }
        }
        System.out.println(count);
    }


    public static void wordFrequency2(String str){
        int count=0;
        for (int i = 0; i <=str.length()-4; i++) {
            if(str.substring(i,i+4).equals("java")){
                count++;
            }
        }
        System.out.println(count);
    }
}
