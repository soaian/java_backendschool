package day13.problem2;

import java.io.*;

public class FileWriterTask implements Runnable{

    @Override
    public void run() {
        try(
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter writer = new PrintWriter("output.txt");){

            System.out.println("output파일에 저장할 내용을 작성해주세요. '0'을 입력하면 입력이 종료됩니다.");
            String msg = null;
            while (!(msg =reader.readLine()).equals("0")){
                    writer.println(msg);
                    writer.flush();
                }
            System.out.println("입력이 종료됩니다.");
        }catch (Exception e){
            e.getMessage();
        }
    }
}
