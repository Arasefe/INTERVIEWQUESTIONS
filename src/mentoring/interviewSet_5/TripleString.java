package mentoring.interviewSet_5;

public class TripleString {
    // We'll say that a "triple" in a string is a char appearing three times in a row.
    // Print out the number of triples in the given string. The triples may overlap.
    // String will be passed into your method

    public static void main(String[] args) {
        triple("asjdsds");
    }

    public static void triple(String word){
        int countTriple=0;
        for (int i = 0; i < word.length(); i++) {
            countTriple=0;
            for (int j = 0; j < word.length();j++) {
                if(word.charAt(i)==word.charAt(j)){
                    countTriple++;
                }
            }
        }
        System.out.println(countTriple);
    }

}
