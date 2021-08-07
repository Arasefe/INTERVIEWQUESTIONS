package myInterviewQuetions;

public class CocoBongo {
    /*
    Write a method that outputs a single line for each number from 1 to 100.
    The end user would like to see the word "Coco" whenever the number is a multiple
    of three. Whenever the number has the digit five in it, the user would like
    to see "Bongo". If the number neither has the digit five in it nor is a multiple
    of three then the line should only output the number.
    For each value, you must follow the following rules:
    If the value is a multiple of 3, print the string "Coco"
    If the value is a multiple of 5, print the string "Bongo"
    If the value has neither digit 5 nor is a multiple of 3 then print the integer value
    Exceptions
    If the input is less than 1, simply return the string "Invalid"
     */
    public static void main(String[] args) {
        System.out.println(cocoBongo(100));
    }

    public static String cocoBongo(Integer n) {
        if (n < 1) {
            return "Invalid";
        }


        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i%3!=0 && !isDigit(i)) {
                result = "" + i;

            } else if (isDigit(i)){
                result = "Bongo";

            }

            else if (i % 3 == 0) {
                result = "Coco";

            }
        }
        return result;
    }


    public static boolean isDigit(int n){
        String str=String.valueOf(n);

        return str.contains("5");
    }


}
