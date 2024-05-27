package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BufferedExam {
    public static void main(String[] args) {
        //키보드로부터 한줄씩 5번 입력 받아서 파일에 출력하는 프로그램을 작성해보시오.
        try(
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter writer = new PrintWriter("test.txt");
                ){
            for (int i =0; i<5; i++) {
                System.out.println("문자를 입력하시오");
                String userInput = reader.readLine();
//                System.out.println(userInput);
                writer.println(userInput);
            }
            }catch (IOException e){
            e.printStackTrace();
        }

    }
}
