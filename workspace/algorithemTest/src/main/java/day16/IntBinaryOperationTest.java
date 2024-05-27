package day16;

public class IntBinaryOperationTest {
    public static void main(String[] args) {
        IntBinaryOperation test = new IntBinaryOperation() {
            @Override
            public int apply(int a, int b) {
                return 0;
            }
        };

        IntBinaryOperation add = (a,b) -> a+b;
        IntBinaryOperation minus = (a,b) -> a-b;
        IntBinaryOperation multiply = (a,b) -> a*b;
        IntBinaryOperation divide = (a,b) -> a/b;
        System.out.println(test.apply(3,4));
        System.out.println(add.apply(3,4));
        System.out.println(minus.apply(3,4));
        System.out.println(multiply.apply(3,4));
        System.out.println(divide.apply(3,4));

        IntBinaryOperation percent = new IntBinaryOperation() {
            @Override
            public int apply(int a, int b) {
                return a%b;
            }
        };

        System.out.println(percent.apply(5,3));

    }
}
