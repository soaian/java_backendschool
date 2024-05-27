package chap04;

public class Factorial {
    static int result = 1;
    static int num(int n){
        for (int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(num(5));
    }
}
