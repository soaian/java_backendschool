package day16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RambdaExample {
    public static void main(String[] args) {
        List<String> names1 = Arrays.asList("Bob","Alice", "Charlie");
        List<String> names2 = Arrays.asList("Bob","Alice", "Charlie");
        //익명 클래스를 사용하여 Comparator 구현
        names1.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sorted with anonymous class : " + names1);

        //람다식을 사용하여 Comparator 구현
        names2.sort((String s1,String s2) -> s1.compareTo(s2));

        System.out.println("Sorted with anonymous class : " + names2);
    }
}
