package day16;

public class MyFunctionalInterface3Test {
    public static void main(String[] args) {
        MyFunctionalInterface3 fi3 = new MyFunctionalInterface3() {
            @Override
            public int method(int x, int y) {
                return x * y;
            }
        };
        System.out.println(fi3.method(3,5));

        fi3 = (x,y) -> {return  x + y ;};

        System.out.println(fi3.method(3,5));
    }
}
