package day08;

public class ExceptionExam05 {
    public  static  void 심부름() throws RuntimeException{
        //예외를 직접
        System.out.println("심부름 시작!!");
        int i =0;
        System.out.println(10 / i);
        System.out.println("심부름 끝");
    }

    public static void main(String[] args) {
        //엄마가 심부름 시킴
        try {
            심부름();
        }catch (Exception e){
            System.out.println("동생에게 시킴");
        }
    }
}
//throws를 사용함으로써 실행자(시킨사람)에게 오류 처리를 던지는 상황
//RuntimeException으로 하면 컴파일 시에는 오류 발생하지 않음