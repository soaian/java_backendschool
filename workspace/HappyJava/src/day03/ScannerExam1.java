package day03;

import java.util.Scanner;

public class ScannerExam1 {
    public static void main(String[] args) {
        // 1부터 입력받은 숫자까지 짝수 합
        Scanner keybord = new Scanner(System.in);
        System.out.print("몇까지의 짝수 합을 구하고 싶나요? ");
        int num = keybord.nextInt();

        int total = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
