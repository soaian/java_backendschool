package problem.teacher;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        System.out.println("안녕하세요, 은행에서 진행할 일을 선택해 주세요.");
        System.out.println("1.계좌조회 2.계좌등록 3.입금 4.출금 5.대출");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("1. 계좌조회를 입력하셨습니다.");
        }
    }
}
