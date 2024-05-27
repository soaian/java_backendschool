package day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
    public static void main(String[] args) {
        try(
        DatagramSocket clientSocket = new DatagramSocket();
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        ){
            //서버의 주소 설정
            InetAddress IpAddress = InetAddress.getByName("Localhost");
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            //키보드 입력받음
            System.out.println("보낼 메시지를 입력 하세요 :: ");
            String message = keyboard.readLine();

            // 서버로 보내기
            DatagramPacket sendPacket = new DatagramPacket(message.getBytes(), message.getBytes().length, IpAddress,8888);
            clientSocket.send(sendPacket);

            //서버로부터 받기
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String receiveMsg = new String(receivePacket.getData());

            //메시지 출력
            System.out.println(receiveMsg);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
