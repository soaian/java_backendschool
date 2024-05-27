package day16.problem;

import java.util.ArrayList;
import java.util.List;

//문제 3: 리스트의 각 요소에 연산 적용하기
public class Problem03 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(2);
        integerList.add(8);

        integerList.forEach(a-> System.out.println(a+10));
    }
}
