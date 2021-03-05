package readerWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFirst {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("data.txt");
        BufferedReader bf=new BufferedReader(fileReader);
        System.out.println(bf.readLine());

    }


}
