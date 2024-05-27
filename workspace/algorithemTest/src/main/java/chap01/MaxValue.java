package chap01;

import java.util.Scanner;

// 세 값의 최대값 구하기
public class MaxValue {

    // 메소드 만들기
    // 접근제한자 리턴타입 메소드명 (매개 변수등...){}
    public static int max(int a, int b, int c){
        Scanner num = new Scanner(System.in);

        if (a>b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        }else if (b > c) {
                return b;
            } else {
                return c;
            }

    }
}
