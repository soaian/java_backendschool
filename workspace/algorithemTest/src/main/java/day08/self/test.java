package day08.self;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자와 문자를 입력해주세요");
        int a = sc.nextInt();
        String b =sc.nextLine();

        if (b== "n"){
            System.out.println("n을 입력하셨습니다.");
        }else{
            System.out.println("잘못된 입력입니다.");
        }

    }
}
