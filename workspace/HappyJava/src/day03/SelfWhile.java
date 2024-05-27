package day03;

public class SelfWhile {
    public static void main(String[] args) {
        //do while
        //do {} -> 무조건 한번은 실행함 while(조건)-> 조건이 참일때까지 do 뒤의 문단을 이상은 시행함
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i<10);
    }
}
