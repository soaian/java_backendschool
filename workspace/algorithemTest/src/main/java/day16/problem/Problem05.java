package day16.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

//문제 5: 요소 변환하기
public class Problem05 {
    public static void main(String[] args) {
        List<Integer> square = new ArrayList<>();
        square.add(3);
        square.add(6);
        square.add(2);
        square.add(5);
        square.add(9);
        UnaryOperator<Integer> squareResult = x -> x * x;
        for (int a:square) {
            System.out.println(squareResult.apply(a));
        }
    }
}
