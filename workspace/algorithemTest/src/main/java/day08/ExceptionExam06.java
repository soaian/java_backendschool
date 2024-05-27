package day08;

public class ExceptionExam06 {
    //1. 예외가 발생했고, 그 예외를 잘 처리한 상황 ->다음문장1,2,3들까지 출력 완료
    //2, 예외가 발생했고, 그 예외를 잘 처리하지 못한 상황 -> finally는 예외 상황과 관계없이 출력되나 예외를 catch하지 못해 뒤의 다음문장1,2,3은 출력되지 않음
    //3. 예외가 발생하지 않았을때 ->예외가 발생하지 않아 catch블럭은 하나도 실행되지 않지만 finally는 출력됨
    public static void main(String[] args) {
        int[] iarr={1,2,3};
        try {
            System.out.println("try start@@");
            int result = 10/2;
            System.out.println(iarr[2]);

//            iarr = null;
            System.out.println(iarr[0]);
            System.out.println("try end!!.");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException catch block");
            System.out.println(e); //toString 생략

        }catch (NullPointerException e) {
            System.out.println("NullPointerException catch block");
            System.out.println(e.getMessage());
            e.printStackTrace(); //오류 메세지 출력해줌

        }finally {
            System.out.println("반드시 실행");
        }
        System.out.println("다음 문장 1");
        System.out.println("다음 문장 2");
        System.out.println("다음 문장 3");
        System.out.println("end!");
    }
}
