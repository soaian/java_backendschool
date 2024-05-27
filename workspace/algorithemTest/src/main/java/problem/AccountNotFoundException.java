package problem;

public class AccountNotFoundException extends Exception{
    public AccountNotFoundException (int diff){
        System.out.println("현재 입력하신 계좌번호 : " + diff + "번으로 기존에 등록된 계좌 번호와 다릅니다.");
    }
}
