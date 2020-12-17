package cybertek_interviewPrep;

import java.util.Arrays;

public class _7SortAlphaNumeric {
    public static void main(String[] args) {
        /*
        Given alphanumeric String, we need to split the string into substrings
        of consecutive letters or numbers, sort the individual string and
        append them back together
         */

        sortAlphanumeric("DC|501|GCCCA|098911");


    }


    public static void sortAlphanumeric(String str){
        String numeric="";
        String alphabetic="";
        char[]ch=str.toCharArray();
        for (char each :ch ) {
            if(Character.isAlphabetic(each)){   // !Character.isDigit(each)
                alphabetic+=each;
            }
            if(Character.isDigit(each)){
                numeric+=each;
            }
        }
        String[]numArr=numeric.split("");
        String[]alphaArr=alphabetic.split("");
        Arrays.sort(numArr);
        Arrays.sort(alphaArr);
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(alphaArr));

    }
}
