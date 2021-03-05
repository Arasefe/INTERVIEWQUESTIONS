package mentoring.interviewSet_4;

public class LargestLength {
    // Given the array of words, it will print the word with the largest length.
    // Assume that there are no 2 words with longest length

    public static void main(String[] args) {
        largestWordInArray1(new String[]{"Aras","Banu","Tulpar","Iso","Efe"});
        largestWordInArray2(new String[]{"Aras","Banu","Tulpar","Iso","Efe"});

    }

    public static void largestWordInArray1(String[]array){
        String largest="";
        for (int i = 0; i < array.length; i++) {
             largest=array[i];
            for (int j = 0; j < array.length; j++) {
                if(array[j].length()>largest.length()){
                    largest=array[j];
                }
            }
        }
        System.out.println(largest);

    }

    public static void largestWordInArray2(String[]array){
        String combined="";
        for(String each:array){
            combined+=each+" ";
        }
        System.out.println(combined);

        }

}
