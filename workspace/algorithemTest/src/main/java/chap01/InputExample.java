package chap01;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int number = sc.nextInt();

        //입력 버퍼 비우기 없으면 뒤에 문자 입력없이 넘어감
        sc.nextLine();

        System.out.println("문자열을 입력하세요");
        String text = sc.nextLine();

        System.out.println("입력받은 정수: "+number);
        System.out.println("입력받은 문자열: "+text);

        //scanner 객체 닫기
        sc.close();
    }
}
