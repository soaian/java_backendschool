package day16.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//문제 4: 조건에 맞는 요소 찾기
public class Problem04 {
    public static void main(String[] args) {
        List<String> sl = new ArrayList<>();
        sl.add("aa");
        sl.add("bbbb");
        sl.add("cccccc");
        sl.add("dddd");
        Predicate<String> overFive = a -> a.length() >=5;
        for (String str: sl){
            if (overFive.test(str)){
                System.out.println(str);
                break;
            }
        }
    }
}
