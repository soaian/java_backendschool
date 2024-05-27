package day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class UDPEchoServer {
    public static void main(String[] args) {
        //udp 통신 특정 port에 datagramsocket 생성
        try(
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        ){
            while (true){
                byte[] receiveData = new byte[1024];
                byte[] sendData;
                DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
                datagramSocket.receive(receivePacket); //보내줘

                String message = new String(receivePacket.getData()).trim();

                InetAddress clientAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(message.getBytes(),message.getBytes().length,clientAddress,port);
                datagramSocket.send(sendPacket);

            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
