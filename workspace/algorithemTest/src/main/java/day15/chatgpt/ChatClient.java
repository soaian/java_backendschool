package day15.chatgpt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 9999);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String id = "";

            // 아이디 입력
            System.out.print("Enter your id: ");
            String input = keyboard.readLine();
            if (input.startsWith("/id")) {
                out.println(input);
            } else {
                System.out.println("Invalid command. Please enter '/id name' to set your id.");
                return; // 아이디 입력이 올바르지 않으면 프로그램 종료
            }

            // 네트워크에서 입력된 내용을 담당하는 부분을 Thread로..
            new InputThread(socket, in).start();

            // 키보드로부터 입력받은 내용을 서버에 보내는 코드
            String msg;
            while ((msg = keyboard.readLine()) != null) {
                out.println(msg);
                if ("/quit".equalsIgnoreCase(msg))
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class InputThread extends Thread {
    private Socket socket;
    private BufferedReader in;

    InputThread(Socket socket, BufferedReader in) {
        this.socket = socket;
        this.in = in;
    }

    @Override
    public void run() {
        try {
            String msg = null;
            while ((msg = in.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}