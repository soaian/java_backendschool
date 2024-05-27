package day17.Problem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem01 {
    public static void main(String[] args) {
        //실습 문제 1: 숫자 배열 처리
        //주어진 정수 배열에서 짝수만을 찾아 그 합을 구하시오.
        int[] numbers = {3, 10, 4, 17, 6};
        int evenSum = Arrays.stream(numbers).filter(a->a%2==0).sum();
        System.out.println(evenSum);

        System.out.println("================================");
        //실습 문제 2: 문자열 리스트 필터링
        //주어진 문자열 리스트에서 길이가 5 이상인 문자열만을 선택하여 대문자로 변환하고, 결과를 리스트로 반환하시오.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> overFive = words.stream().map(word->word.toUpperCase()).filter(a->a.length()>=5).collect(Collectors.toList());
        System.out.println(overFive);

        System.out.println("================================");



    }
}
