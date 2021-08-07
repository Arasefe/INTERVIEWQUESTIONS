package techproed.InterviewSet_Set1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateRandomNameList {
    public static void main(String[] args) {

    }
    private static List<String> createRandomNames(int numOfNames){

        List<String>randomNames=new ArrayList<>();
        List<String>list=alphabet();
        for (int i = 0; i < numOfNames; i++) {
            String name = "";
            int length = new Random().nextInt(25);
            for (int j = 0; j <= length; j++) {
                int num = new Random().nextInt(26);
                name += list.get(num);
            }
            randomNames.add(name);
        }
        return randomNames;
    }

    static ArrayList<String> alphabet(){
        ArrayList<String> al = new ArrayList<>();
        for(char i = 97; i <= 122; i++){
            String each = i + "";
            al.add(each);
        }
        return al;
    }
}
