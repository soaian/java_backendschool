package Day09;

public class Network {
    private static int totalMessages = 0;

    public static class Message {
        private String content;

        public Message(String content) {
            this.content = content;
            totalMessages++;
        }

        public void send() {
            System.out.println("메시지 전송: " + content);
            System.out.println("전체 메시지 수: " + totalMessages);
        }
    }

    public static int getTotalMessages() {
        return totalMessages;
    }

    public static void main(String[] args) {
        Network.Message msg1 = new Network.Message("안녕하세요!");
        msg1.send();

        Network.Message msg2 = new Network.Message("반갑습니다!");

        msg2.send();

        System.out.println("네트워크를 통해 전송된 전체 메시지 수: " + Network.getTotalMessages());
    }
}
