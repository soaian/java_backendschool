package day08;

public class ExceptionExam02 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작!!");

        int i = Integer.parseInt(args[0]);

        try {
            System.out.println(10/i);
        }catch (Exception e){
            System.out.println("잘못된 인덱스 접근입니다: "+e.getMessage());
        }

        System.out.println("프로그램 종료");
    }
}
