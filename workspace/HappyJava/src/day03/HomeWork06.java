package day03;

import java.util.Scanner;

//실습 문제 6: 양의 정수의 합 구하기
//사용자로부터 양의 정수들을 계속 입력받되, 사용자가 0을 입력하면 입력을 중단하고 그때까지 입력받은 양의 정수들의 총합을 출력하는 프로그램을 작성하세요. do-while 루프를 사용하여 구현하세요.
public class HomeWork06 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int sum= 0;
        int i;
       do {
           System.out.println("양의 정수를 입력하시오");
           i = num.nextInt();
           sum+=i;

       } while (i!=0);
        System.out.println("총합은 "+sum+" 입니다.");


    }
}
