package day03;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println("2번 문제입니다.");
        Scanner score = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int x = score.nextInt();
        if (x%2==0){
            System.out.println("짝수 입니다.");
        } else System.out.println("홀수 입니다.");

    }
}
