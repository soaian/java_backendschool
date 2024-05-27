package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class RambdaExam4 {
    public static void main(String[] args) {
        //메소드 참조 ::
        //1. 정적 메소드 참조
        BiFunction<Integer,Integer,Integer> maxFunc = Math::max;
//        BiFunction<Integer,Integer,Integer> maxFunc = (a,b) -> Math.max(a,b); =>화살표 함수로 표시한다면 이렇게 표현됨
        System.out.println(maxFunc.apply(3,5));


        //2. 인스턴스 메서드 참조
        String str = "hello world";
        Supplier<Integer> lengthFunc = str :: length;
        System.out.println(lengthFunc.get());


        //3. 임의 객체의 인스턴스 메서드 참조
        List<String> words = Arrays.asList("Hello","world","java","carami");
        List<Integer> lengths = new ArrayList<>();
        Function<String,Integer> lengthFunc2 = String :: length;
        for (String word : words){
            lengths.add(lengthFunc2.apply(word));
        }
        System.out.println(lengths);

        //4. 생성자 참조
        Supplier<List<String>> listSupplier = ArrayList :: new;
        List<String> list = listSupplier.get();
        list.add("hello");
        list.add("haha");
        list.add("carami");

        System.out.println(list);
    }
}
