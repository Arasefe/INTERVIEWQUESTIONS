package mostCommonIQ;

public class _2RemoveWhiteSpacesInString {
    public static void main(String[] args) {
        removeSpacesInString("Too many cooks spoil the broth");
    }

    public static void removeSpacesInString(String word){
        String strWitOutSpace="";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)!=' '){
                strWitOutSpace+=word.charAt(i);
            }
        }
        System.out.println(strWitOutSpace);
    }
}
