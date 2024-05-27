package day03;

public class IfExam {
    public static void main(String[] args) {
        if (3>5){
            System.out.println("앞이 더 큰 수 입니다.");
        } else {
            System.out.println("뒤에가 더 큰 수 입니다.");
        }

        int a=4;
        int b=5;
        if (a>b){
            System.out.println("a가 b보다 큽니다");
        } else {
            System.out.println("b가 a보다 큽니다");
        }

        if (a%2==0){
            System.out.println("a는 짝수입니다.");
           } else {
            System.out.println("a는 홀수입니다.");
        }
    }
}
