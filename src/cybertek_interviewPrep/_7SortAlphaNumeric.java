package cybertek_interviewPrep;

public class _7SortAlphaNumeric {
    public static void main(String[] args) {
        /*
        Given alphanumeric String, we need to split the string into substrings
        of consecutive letters or numbers, sort the individual string and
        append them back together
         */

        sortAlphanumeric("DC501GCCCA098911");


    }


    public static void sortAlphanumeric(String str){
        String numeric="";
        String alphabetic="";
        char[]ch=str.toCharArray();
        for (char each :ch ) {
            if(Character.isAlphabetic(each)){
                alphabetic+=each;
            }
            if(Character.isDigit(each)){
                numeric+=each;
            }
        }


    }
}
