package day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try(
                ServerSocket serverSocket = new ServerSocket(9999);
                Socket socket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(),true); //flush를 println할때 자동으로 들어가게끔 하겠다
                ){
                    String line = null;
                    while ((line = in.readLine()) != null){
                        System.out.println("클라이언트에서 받은 메세지 : " + line);
                        out.println(line);
                    }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
