package mentoring.interviewSet_5;

public class SumOfDigits {
    // Given a string str, print out the sum of the digits 0-9 that appear in the string,
    // ignoring all other characters. Print out 0 if there are no digits in the string.
    public static void main(String[] args) {
        //sumOfDigits("hds23nksdn9292lad");
        sumOfDigits2("hds23nksdn9292lad");
    }

    public static void sumOfDigits(String str){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                sum += Integer.parseInt(str.charAt(i) + "");
            }
        }
        System.out.println("sum = " + sum);

    }

    public static void sumOfDigits2(String word){
        int sum=0;
        for (int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i))){
                sum+=Integer.parseInt(word.charAt(i)+"");
            }
        }
        System.out.println("sum = " + sum);
    }
}
