package problem.chatgpt;
import java.util.*;

class Account {
    int accountNum;
    String name;
    int balance = 0;
    List<Account> accounts = new ArrayList<>();

    public Account(int accountNum, String name, int balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }

    // Custom exception for account not found
    public class AccountNotFoundException extends Exception {
        public AccountNotFoundException(int accountNumber) {
            super("Account not found: " + accountNumber);
        }
    }

    // Custom exception for insufficient funds
    public class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    // 출금 (잔액부족 예외)
    public void withdraw(int accountNumber, int amount) throws AccountNotFoundException, InsufficientFundsException {
        if (accountNum != accountNumber) {
            throw new AccountNotFoundException(accountNumber);
        } else if (balance - amount < 0) {
            throw new InsufficientFundsException("잔액이 부족합니다. 현재 잔액: " + balance);
        } else {
            balance -= amount;
            System.out.println(accountNumber + "계좌에 " + amount + "원이 출금되어 현재 잔액은 " + balance + "원 입니다.");
        }
    }

    // 입금
    public void deposit(int accountNumber, int amount) throws AccountNotFoundException {
        if (accountNum != accountNumber) {
            throw new AccountNotFoundException(accountNumber);
        } else {
            balance += amount;
            System.out.println(accountNumber + "계좌에 " + amount + "원이 입금되어 현재 잔액은 " + balance + "원 입니다.");
        }
    }
}

class AccountService {
    public void performWithdraw(Account account, int accountNumber, int amount) {
        try {
            account.withdraw(accountNumber, amount);
        } catch (Account.AccountNotFoundException | Account.InsufficientFundsException e) {
            handleException(e);
        }
    }

    public void performDeposit(Account account, int accountNumber, int amount) {
        try {
            account.deposit(accountNumber, amount);
        } catch (Account.AccountNotFoundException e) {
            handleException(e);
        }
    }

    private void handleException(Exception e) {
        System.out.println("출금 또는 입금 실패: " + e.getMessage());
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(1234, "홍길동", 100);
        AccountService accountService = new AccountService();

        System.out.println("출금하시려는 계좌번호와 금액을 입력해주세요");
        int numOfAccount = sc.nextInt();
        int amountOfMoney = sc.nextInt();

        accountService.performWithdraw(account, numOfAccount, amountOfMoney);
        accountService.performDeposit(account, numOfAccount, amountOfMoney);
    }
}
