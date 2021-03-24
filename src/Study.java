import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Study {
    public static void main(String[] args) {
        anagram("elb", "below");
    }

    public static void anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("No anagram");
        } else {
            List<String> ls1 = new ArrayList<>(Arrays.asList(str1.split("")));
            List<String> ls2 = new ArrayList<>(Arrays.asList(str2.split("")));

            Collections.sort(ls1);
            Collections.sort(ls2);

            System.out.println(ls1.equals(ls2));

        }
    }

}
