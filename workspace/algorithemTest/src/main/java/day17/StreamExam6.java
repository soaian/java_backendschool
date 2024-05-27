package day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        // forEach 사용 예시
        numbers.stream()
                .forEach(n -> System.out.println("Number: " + n));


        // peek 사용 예시
        List<Integer> doubledNumbers = numbers.stream()
                .peek(n-> System.out.println("Processing 1: "+n)) //각 요소를 중단시키지 않고 그대로 순회함 ex->1,2,3,4,5를 그대로 출력하지 않고 1출력후 밑으로 내려감
                .map(n->n*2)
                .peek(n-> System.out.println("Processing 2: "+n))
                .collect(Collectors.toList());

    }
}
