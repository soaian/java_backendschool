package chap04;

import java.util.Scanner;

public class Self1 {
    public static void main(String[] args) {


        System.out.println("4번 문제입니다.");
        Scanner num = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int number = num.nextInt();
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;

        }
        System.out.println(number + "! = " + sum);
    }
}

