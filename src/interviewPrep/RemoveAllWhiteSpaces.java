package interviewPrep;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\p{Punct}", " ");
        System.out.println("After replacement: " + sentence);
    }
}
