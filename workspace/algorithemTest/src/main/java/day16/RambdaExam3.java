package day16;

import java.util.List;
import java.util.function.*;

public class RambdaExam3 {
    public static void main(String[] args) {
        //Predicate
        //조건을 테스트하는데 사용. boolean값 반환
        Predicate<Integer> isPositive = x -> x > 5;

        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(3));

        //Consumer
        //입력을 받고 반환값이 없는 연산을 수행
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("hello carami");

        //Function
        //입력을 받아서 출력을 반환하는..
        Function<String,Integer> langthFunc = s -> s.length();
        System.out.println(langthFunc.apply("hello carami"));

        //Supplier
        //입력 없이 값을 반환
        Supplier<Double> randomSupplier = () -> (Math.random()*10)+1;
        System.out.println(randomSupplier.get());

        IntSupplier intSupplier = () -> (int) Math.random()*6+1;
        System.out.println(intSupplier.getAsInt());

        //UnaryOperator
        //입력과 출력이 같은 타입의 값일 때 사용.
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        //BiFunction
        //두개의 입력을 받고 하나의 결과를 반환
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        System.out.println(add.apply(3,5));


        //Consumer 의 andThen 메소드 활용
        Consumer<String> conA = s -> System.out.println(s+"aaa");
        Consumer<String> conB = s -> System.out.println(s+"bbb");
        conA.accept("carami");
        conB.accept("carami");
        Consumer<String> conAB = conA.andThen(conB); //일단은 A가 동작하고 그 후 다시 B가 출력됨 -> 즉 연달아서 동작할때 andThen메서드를 사용
        conAB.accept("hello");
    }
}
