package day17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        List<String> sortedFruits = fruits.stream()
                                    .sorted()
                                    .collect(Collectors.toList());
        System.out.println(sortedFruits);

        List<String> reverseFruits = fruits.stream()
                                    .sorted(Comparator.reverseOrder())
                                    .collect(Collectors.toList());

        System.out.println(reverseFruits);

        int[] iarr = {5,3,27,9,5,9,0,4,34};
        //위 배열을 오름차순으로 정렬해서 출력
        Arrays.stream(iarr).sorted().forEach(System.out::println);


        // 위 배열을 내림차순으로 정렬해서 출력
        Arrays.stream(iarr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
