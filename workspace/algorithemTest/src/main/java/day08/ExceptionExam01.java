package day08;

import java.lang.reflect.Array;

public class ExceptionExam01 {
    public static void main(String[] args) {
        int[] iarr={1,2,3};
        try {
            int result = 10/0;
            System.out.println(iarr[3]);
            System.out.println("거울을 본다.");

//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e); //toString 생략
        }catch (Exception e) {
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace(); //오류 메세지 출력해줌
        }
        System.out.println("다음 문장 1");
        System.out.println("다음 문장 2");
        System.out.println("다음 문장 3");
        System.out.println("end!");
    }
}
