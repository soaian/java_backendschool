package day03;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        System.out.println("1번 문제입니다.");
        Scanner sc = new Scanner(System.in);
        System.out.println("섭씨 온도를 입력하세요.");
        int c = sc.nextInt();
        int f = c * 9 / 5 + 32;
        System.out.println("화씨온도는 " + f + " 입니다.");
    }
}
