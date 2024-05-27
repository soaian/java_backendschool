package problem;

import java.util.ArrayList;
import java.util.List;

public class Account {
    int accountNum;
    String name;
    int balance = 0;
    List<Account> accounts = new ArrayList<>();

    public Account(int accountNum, String name, int balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }
    //출금 (잔액부족 예외)
    public void withdraw(int accountNumber,int amount) throws InsufficientFundsException, AccountNotFoundException{
        if (accountNum != accountNumber){
            throw new AccountNotFoundException(accountNumber);
        } else if(balance-amount<0){
            System.out.println(accountNumber + "번 계좌 확인되셨습니다.");
            throw new InsufficientFundsException("잔액이 부족합니다.");
        }else {
            balance = balance-amount;
            System.out.println(accountNumber + "계좌에 " + amount+"원이 출금되어 현재 잔액은 " + balance + "원 입니다.");
        }
    }

    //입금
    public void deposit(int accountNumber,int amount) throws AccountNotFoundException{
        if (accountNum != accountNumber){
            throw new AccountNotFoundException(accountNumber);
        }else {
            System.out.println(accountNumber + "번 계좌 확인되셨습니다.");
        }
        balance = + amount;
        System.out.println(accountNumber + "계좌에 " + amount+"원이 입금되어 현재 잔액은 " + balance + "원 입니다.");
    }
}
