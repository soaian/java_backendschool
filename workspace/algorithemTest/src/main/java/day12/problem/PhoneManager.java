package day12.problem;

import java.io.*;

public class PhoneManager {
    public static void main(String[] args) {
        try(
                BufferedReader userType = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter write = new PrintWriter("phone.txt"); //outputStream을 이용한다면 Filereader를 한  try블럭 안에 사용할 수 있음
                ){
                for (int i = 0; i<3 ; i++){
                    System.out.println("이름 : ");
                    String name = userType.readLine();
                    System.out.println("전화번호 : " );
                    String number = userType.readLine();
                    write.println(name + " " + number);  //writer.flush() -> 쓰기 버퍼를 즉시 반영(기존데이터 지우고) 이용하는게 좋음
                }
                System.out.println("전화번호가 phone.txt에 저장되었습니다.");
                System.out.println();
        }catch (IOException e){
            e.printStackTrace();
        }
        try(
                BufferedReader reader = new BufferedReader(new FileReader("phone.txt"));)

                {   System.out.println("phone.txt의 내용은 다음과 같습니다.");
                    for (int i=0 ; i<3 ; i++) {
                        System.out.println(reader.readLine());
                    }
                }catch (IOException e) {
                 e.printStackTrace();
        }
    }
}
