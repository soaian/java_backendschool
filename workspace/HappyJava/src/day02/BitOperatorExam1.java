package day02;

public class BitOperatorExam1 {
    public static void main(String[] args) {
        int a = 4;
        int b = a >> 1;
        System.out.println(b);
        // 00000000 00000000 00000000 00000100 (4를 비트로 표현)
        // 00000000 00000000 00000000 00000010 (1칸이 오른쪽으로 밀려 2로 표현됨)
        int c = 4;
        int d = c << 1;
        System.out.println(d);
        // 00000000 00000000 00000000 00000100 (4를 비트로 표현)
        // 00000000 00000000 00000000 00001000 (1칸이 왼쪽으로 밀려 8로 표현됨)
    }
}
