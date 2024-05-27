package day16.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

//문제 6: 모든 요소에 대해 조건 확인하기
public class Problem06 {
    public static void main(String[] args) {
        List<Integer> intL = new ArrayList<>();
        intL.add(3);
        intL.add(2);
        intL.add(5);
        intL.add(7);
        intL.add(8);
        intL.add(10);
        UnaryOperator<Integer> even = a -> a % 2;
        Predicate<Integer> check = a -> a==0;
        for (int a : intL){
            if (check.test(even.apply(a))){
                System.out.println("짝수");
            }else {
                System.out.println("홀수");
            }
        }
    }
}
