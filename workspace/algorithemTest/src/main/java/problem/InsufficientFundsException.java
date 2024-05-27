package problem;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String msg){
        System.out.println(msg);
    }
}
