package day12;

import java.io.*;

public class IOExam3 {
    public static void main(String[] args) {
        //"test.txt" 파일에서 한줄씩 입력받아서 입력받은 문자뒤에 hi을 추가하세요
        // 파일에 출력하는 프로그램을 작성해보세요.
        try (
                BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
                PrintWriter writer = new PrintWriter("test2.txt");
                ){
                 String line;
                 while((line = reader.readLine()) != null) {
                writer.println(line + "hi");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
