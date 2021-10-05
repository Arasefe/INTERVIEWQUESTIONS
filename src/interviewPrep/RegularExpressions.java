package interviewPrep;

import java.util.Arrays;

public class RegularExpressions {
    public static void main(String[] args) {
        /*
        Given alphanumeric String, we need to split the string into substrings
        of consecutive letters or numbers, sort the individual string and
        append them back together
         */

        //sortAlphanumeric1("DC|501|GCCCA|098911");
        //sortAlphanumeric2("DC|501|GCCCA|098911");
        sortAlphanumeric3("DC|501|GCCCA|098911");


    }


    public static void sortAlphanumeric1(String str) {
        String numeric = "";
        String alphabetic = "";
        char[] ch = str.toCharArray();
        for (char each : ch) {
            if (Character.isAlphabetic(each)) {   // !Character.isDigit(each)
                alphabetic += each;
            }
            if (Character.isDigit(each)) {
                numeric += each;
            }
        }
        String[] numArr = numeric.split("");
        String[] alphaArr = alphabetic.split("");
        Arrays.sort(numArr);
        Arrays.sort(alphaArr);
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(alphaArr));

    }

    private static void sortAlphanumeric2(String str) {
        // To replace each punctuation
        str = str.replaceAll("\\p{Punct}", "");

        // To find only numbers

        String numbers = str.replaceAll("\\p{Alpha}", "");
        System.out.println(numbers);

        // To find only letters
        String letters = str.replaceAll("\\p{Digit}", "");
        System.out.println(letters);
    }


    private static void sortAlphanumeric3(String str){
        str = str.replaceAll("\\p{Punct}", "");
        String numbers = str.replaceAll("\\p{Alpha}", "");
        System.out.println(numbers);

        int sum=0;
        for (int i = 0; i < numbers.length(); i++) {
            sum+=Integer.parseInt(""+numbers.charAt(i));
        }
        System.out.println(sum);
    }
}
