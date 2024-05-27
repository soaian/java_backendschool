package problem;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) throws InsufficientFundsException, AccountNotFoundException {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(1234,"홍길동",100);
        System.out.println("출금하시려는 계좌번호와 금액을 입력해주세요");
        int numOfAccount = sc.nextInt();
        int amountOfMoney = sc.nextInt();
        try {
            account.withdraw(numOfAccount, amountOfMoney);
        }catch (AccountNotFoundException e){
            System.out.println("현재 등록된 계좌번호 : " + account.accountNum);
            account.withdraw(account.accountNum, amountOfMoney);
        }catch (InsufficientFundsException e){
            System.out.println("현재 잔액 : " + account.balance + "원 있습니다.");
            System.out.println(account.balance + "만큼 출금하시겠습니까? Y:네 / N:아니오");
            sc.nextLine();
            String answer = sc.nextLine();
            if (answer.equals("y")){
                System.out.println(account.balance + "만큼 출금되었습니다.");
                account.balance = 0;
                System.out.println("현재 잔액은 : " + account.balance + "원 입니다.");
            }else if(answer.equals("n")){
                System.out.println("금액이 부족하여 출금을 진행할 수 없습니다.");
            }else {
                System.out.println("잘못된 입력으로 처음으로 돌아갑니다.");
                return;
            }
        }
//        account.deposit(1234,100);
    }
}
