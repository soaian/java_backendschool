package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIOExample {
    public static void main(String[] args) {
        //키보드(==System.in) 로부터 한줄(buffered) 입력받기 위한 IO객체 생성
        try(
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){ //bufferedReader는 println(한줄입력이기 때문에)과 동일하다. InputStreamReader는 연결해주는 역할만 함.
            System.out.println("문자열을 입력하세요.");
            String userInput = br.readLine();
            System.out.println(userInput);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
