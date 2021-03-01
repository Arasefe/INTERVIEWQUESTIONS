package rahul;

public class _12CharOccurrence {

    public static void main(String[] args) {
        int count=countOccurrences("dhsjdaschsj",'c');
        System.out.println(count);
    }

    public static int countOccurrences(String str,char ch){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
