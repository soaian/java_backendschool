package chap01;
//3값의 중앙값 찾기
public class MiddleValue {
    public static int middle(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                return b;
            } else if (a < c) {
                return a;
            } else {
                return c;
            }
        } else if (a>c) {
            return a;
        } else if (b>c){
            return c;
        } else {
            return b;
        }
    }
}
        



