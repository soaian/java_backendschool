package Day09;

public class StaticExam {
    int i = 10;
    static int si = 20;

    public void m1(){
        System.out.println(i);
        System.out.println(si);
    }
    public static void m2(){
//        System.out.println(i); 불가능 -> static이 먼저 생성되기 때문에 메서드가 먼저 생성되어 static하지 않은 걸 사용할 수 없음
        System.out.println(si);
//        m1();
    }
}
