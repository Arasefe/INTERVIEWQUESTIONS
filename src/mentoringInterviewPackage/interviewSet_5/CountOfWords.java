package mentoringInterviewPackage.interviewSet_5;

public class CountOfWords {
    // Print true if the string "cat" and "dog" appear the same number of times in the given string word.
    public static void main(String[] args) {
        System.out.println(countOfWords("catdogcatcatdogdog"));
    }

    public static boolean countOfWords(String word){
            int countCat=0;
            int countDog=0;
            for (int i = 0; i <= word.length()-3; i++) {
                if(word.substring(i,i+3).equals("dog")) {
                    countDog++;
                }
            }
            for (int j = 0; j <= word.length()-3; j++) {
                if(word.substring(j,j+3).equals("cat")) {
                    countCat++;
                }
            }
            if(countCat==countDog){
                return true;
            }
            return false;
        }
    }

