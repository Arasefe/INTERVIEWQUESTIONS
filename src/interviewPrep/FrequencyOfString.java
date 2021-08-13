package interviewPrep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyOfString {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("data.txt");
        BufferedReader bf=new BufferedReader(fileReader);
        System.out.println(bf.readLine());
        frequencyOfWord(bf.readLine(), "testing");
    }

    public static void frequencyOfWord(String paragraph, String word){
        List<String>words=new ArrayList<>(Arrays.asList(paragraph.split(" ")));
        int fr=0;
        for (int i = 0; i <= words.size(); i++) {
            fr= Collections.frequency(words,word);
        }
        System.out.println(fr);
    }
}
