package day12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExam {
    public static void main(String[] args) {
        try( FileReader reader = new FileReader("a.txt");
             FileWriter writer = new FileWriter("b.txt");){
        int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
        }
    }
    catch(IOException e) {
        e.printStackTrace();
        }
    }
}
