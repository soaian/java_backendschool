package day14;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try(
                Socket sock = new Socket("127.0.0.1", 9999);
                PrintWriter pw = new PrintWriter(sock.getOutputStream(),true); // 서버의 input과 연결 (입출력이 서로 교차)
                BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                BufferedReader keybord = new BufferedReader(new InputStreamReader(System.in));

        ){      System.out.println(9999 + "포트와 연결되었습니다.");
                String line = null;
                while ((line = keybord.readLine()) != null){
                if (line.equalsIgnoreCase("quit")){
                    System.out.println("메시지 전송을 종료합니다.");
                    // if("quit".equalsIgnoreCase(line.trm())) -> quit가 앞에있기때문에 nullpointexception예외를 발생 안시킬 수 있음. 즉 방어적 코딩임 -> 이런식으로 한번 더 생각해서 코드를 짜는게 좋음
                    break;
                }
                //서버에게 보냄
                pw.println(line);
                pw.flush();

                //서버에서 받음
                String echo = br.readLine();
                System.out.println("서버로부터 받은 응답 메시지 : " + echo);
                }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
