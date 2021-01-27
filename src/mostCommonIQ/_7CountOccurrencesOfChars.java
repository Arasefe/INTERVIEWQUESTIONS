package mostCommonIQ;

public class _7CountOccurrencesOfChars {
    public static void main(String[] args) {

        countOccurrencesOfChars("akjdskhdsd");      //a1k2j1d3s2h1
    }

    public static void countOccurrencesOfChars(String str){
        String nonRepeated="";
        for (int i = 0; i < str.length(); i++) {
            if(!nonRepeated.contains(str.charAt(i)+"")){
                nonRepeated+=str.charAt(i);
            }
        }
        String result="";

        for (int i = 0; i < nonRepeated.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==nonRepeated.charAt(i)){
                    count++;
                }
            }
            result+=nonRepeated.charAt(i)+""+count;
        }

        System.out.println(result);
    }
}
