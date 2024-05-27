package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExam2 {
    public static void main(String[] args) {
        //파일로부터 읽어서 -- 입력통로가 필요
        //파일에 쓴다. -- 출력통로가 필요
        //final이 복잡하기에 알아서 closea할수 있게끔 코드 작성
        try (FileInputStream in = new FileInputStream("src/main/java/day12/ReadFile.java");
             FileOutputStream out = new FileOutputStream("outputFile.txt");) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
