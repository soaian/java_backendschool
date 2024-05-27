package Self;

import java.util.Random;
import java.util.Scanner;

public class Self02 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("=========두번째=========");
        Scanner rd = new Scanner(System.in);
        System.out.println("a 숫자를 입력하시오");
        int a= rd.nextInt();
        System.out.println("b 숫자를 입력하시오");
        int b= rd.nextInt();
        int sum = a+b;
        int minus = a-b;
        System.out.println(a + " 더하기 "+ b +"는 "+ sum);
        System.out.println(a+ " 마이너스 "+ b +"는 "+ minus);
    }
}
