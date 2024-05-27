package day18;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    //채팅방-> 무조건 번호다음에 이름지을수 있게끔
    //다른채팅방은 무조건 이름 변경 불가능
    private String chatroomName;
    private List<PrintWriter> rooms = new ArrayList<>();

    public ChatRoom(String chatroomName){
        this.chatroomName = chatroomName;
    }


}
