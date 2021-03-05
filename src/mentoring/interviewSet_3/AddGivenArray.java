package mentoring.interviewSet_3;

public class AddGivenArray {
    //3. Write a method to add all the digits in given number.

    public static void main(String[] args) {
        extractDigits(342973);
    }

    public static void extractDigits(int number){
        String digits="";
        while(number>=0){
            int digit=number%10;
            System.out.println(digit);
            number/=number;
        }

    }
}
