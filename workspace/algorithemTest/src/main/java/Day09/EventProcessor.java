package Day09;

public class EventProcessor {
    public void processEvent(String event){
        class EventHandler{
            public void handle(){
                System.out.println("처리 중인 이벤트 : " + event);
            }
        }
        EventHandler handler = new EventHandler();
        handler.handle();
    }

    public static void main(String[] args) {
        EventProcessor processor = new EventProcessor();
        processor.processEvent("데이터 업데이트");
    }
}
