package day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IOExam2 {
    public static void main(String[] args) throws Exception {
        //키보드로부터 한줄씩 입력받아서 콘솔에 출력하고 싶다

        //키보드 System.in
        //한줄씩 읽기 위해서 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // bufferedReader는 데코레이터 코드라서 메인으로 쓸 수 없다. 그래서 inputstream을 끼워야한다.
        BufferedReader br2 = new BufferedReader(new FileReader("a.txt"));

        String str= br.readLine();

        System.out.println(str);

        System.out.println(br2.readLine());
    }
}

//InputStream
//FileInputStream: 메인
//2. ByteArrayInputStream: 메인
//3. BufferedInputStream: 데코
//4. DataInputStream: 데코

//OutputStream
//FileOutputStream 메인
//2. ByteArrayOutputStream 메인
//3. BufferedOutputStream 데코
//4. DataOutputStream 데코