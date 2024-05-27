package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam03 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc");
    }
}

//예외종류 2가지
// 실행시 체크하는 예외(Runtime exception).
// int[] iarr = null
// iarr[0];
// 컴파일시 체크하는 예외. (checked Exception)
//FileInputStream fis = new FileInputStream("abc");

//예외처리방법 2가지
//1. try-catcg 로 처리
//2. throws 하는방법 (너가 직접 처리해라고 던지는 방법)
