package readerWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFirst {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("data.txt");
        BufferedWriter bw=new BufferedWriter(fileWriter);
        String myContent="This is written using BufferedWriter";
        bw.newLine();
        bw.write(myContent);
        bw.close();
        System.out.println("Success");

    }
}
