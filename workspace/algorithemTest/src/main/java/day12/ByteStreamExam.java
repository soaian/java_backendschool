package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExam {
    public static void main(String[] args) {
        //파일로부터 읽어서 -- 입력통로가 필요
        //파일에 쓴다. -- 출력통로가 필요
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src/main/java/day12/ReadFile.java");   //    /=> 파일 밑에 == \\
            out = new FileOutputStream("outputFile.txt");

            int c;
            while ((c=in.read()) != -1){
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (in != null){
                try {
                in.close();
                }catch (IOException e) {
                e.printStackTrace();
                }
            }
        }
    }
}
