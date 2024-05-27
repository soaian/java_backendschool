package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EchoThreadServer2 {
    public static void main(String[] args) {
        // 1. ServerSocket 생성 --> 1개만 있으면 됨.
        try(
                ServerSocket serverSocket = new ServerSocket(9999);

        ){
            while (true) {
                Socket clientSock = serverSocket.accept(); //클라이언트 수만큼 반복되어야함
                // 클라이언트마다 각자 실행할 수 있도록 만들어야함!! (쓰레드!!)
                EchoThread2 echoThread2 = new EchoThread2(clientSock);
                echoThread2.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class EchoThread2 extends Thread{
    private Socket socket;
    List<Socket> socketList = new ArrayList<>();
    EchoThread2(Socket socket){
        this.socket = socket;
        socketList.add(socket);
    }

    @Override
    public void run() {
        System.out.println(socket.getInetAddress().getHostAddress() + "로 부터 연결되었습니다. ");

        for (int i = 0 ; i< socketList.size();i++){
        try(
                PrintWriter out = new PrintWriter(socketList.get(i).getOutputStream(),true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        )
        {
            String line = null;
            while ((line = in.readLine()) != null){
                System.out.println("클라이언트로 부터 받은 메시지 : " + line);
                    out.println(line);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }
}

