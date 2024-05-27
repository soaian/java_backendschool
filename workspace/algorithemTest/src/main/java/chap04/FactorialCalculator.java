package chap04;
// 팩토리얼
public class FactorialCalculator {
    static int computer(int i){
        if(i>0){
            return i * computer(i-1);
        }else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(computer(5));
    }
}
