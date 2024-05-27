package day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RambdaExam2 {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(5,2,3,1,4);
        List<Integer> numbers2 = Arrays.asList(5,2,3,1,4);

        Collections.sort(numbers1, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });
        System.out.println(numbers1);
        System.out.println("=================람다식======================");
        Collections.sort(numbers2,(Integer a, Integer b)->{return a.compareTo(b);});
        numbers2.forEach(n-> System.out.println(n));
    }
}
