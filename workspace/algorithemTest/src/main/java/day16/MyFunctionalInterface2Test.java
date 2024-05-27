package day16;

public class MyFunctionalInterface2Test {
    public static void main(String[] args) {


        MyFunctionalInterface2 fi2 = new MyFunctionalInterface2() {
            @Override
            public void method(int a) {
                int result = a * 5;
                System.out.println(result);
            }
        };

        fi2.method(10);


    }
}
