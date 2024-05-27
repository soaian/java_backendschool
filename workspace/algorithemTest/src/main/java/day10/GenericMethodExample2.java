package day10;

public class GenericMethodExample2 {
    public  static <T extends  Number> T max(T x, T y, T z){ //Number가 구현할수있는걸 다 이용할 수 있음
        T max = x; //초기 최댓값 설정

        if (y.doubleValue() > max.doubleValue()){
            max = y;
        }
        if (z.doubleValue() > max.doubleValue()){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("최댓값 : " + max(3,4,5));
        System.out.println("최댓값 : " + max(6.6,8,9.7));
        System.out.println("최댓값 : " + max(15.5f,11.1f,9));
    }
}
