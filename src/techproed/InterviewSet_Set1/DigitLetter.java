package techproed.InterviewSet_Set1;

public class DigitLetter {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("a2sa84adf7"));
    }
    private static int sumOfDigits(String str){
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                sum+=Integer.parseInt(str.substring(i,i+1));
            }
        }
        return sum;
    }
}
