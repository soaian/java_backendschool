package day16;

public class FinalVariableExam {
    public static void main(String[] args) {
        int x =10;
        System.out.println("람다에서 파이널로 사용.");
        Runnable r = () -> {
            System.out.println("x : " + x);
        };
//        x= 20;   x를 다시 바꾸는 부분이 없는것. 즉 final 표시가 없어도 final로 인식. 사실상 final일때만 람다표기를 사용할 수 있음.
        r.run();
    }
}
